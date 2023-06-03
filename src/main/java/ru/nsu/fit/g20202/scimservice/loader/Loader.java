package ru.nsu.fit.g20202.scimservice.loader;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import org.springframework.stereotype.Component;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.mappers.UserMapper;
import ru.nsu.fit.g20202.scimservice.service.UserService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Loader
{
    private final UserService userService;
    private final UserMapper userMapper;

    public Loader(UserMapper userMapper, UserService userService)
    {
        this.userMapper = userMapper;
        this.userService = userService;
        this.loadUsers();
    }

    private void loadUsers()
    {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("userName", "userName");
        HeaderColumnNameTranslateMappingStrategy<UserDTO> strategy =
                new HeaderColumnNameTranslateMappingStrategy<>();
        strategy.setType(UserDTO.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try
        {
            // src/main/resources/users.csv
            csvReader = new CSVReader(new FileReader("/usr/app/users.csv"));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        CsvToBean<UserDTO> csvToBean = new CsvToBean<>();
        List<UserDTO> list = csvToBean.parse(strategy, csvReader);
        for(UserDTO userDTO : list)
        {
            try {
                userService.createUser(UserMapper.toEntity(userDTO));
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
