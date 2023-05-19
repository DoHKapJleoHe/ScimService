package ru.nsu.fit.g20202.scimservice.loader;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import org.springframework.stereotype.Component;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.mappers.UserMapper;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Loader
{
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Loader(UserRepository userRepository, UserMapper userMapper)
    {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
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
            csvReader = new CSVReader(new FileReader("src/main/resources/users.csv"));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        CsvToBean<UserDTO> csvToBean = new CsvToBean<>();
        List<UserDTO> list = csvToBean.parse(strategy, csvReader);
        for(UserDTO userDTO : list){
            userRepository.save(userMapper.toEntity(userDTO));
        }
    }
}
