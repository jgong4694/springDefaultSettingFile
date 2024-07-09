package kbar3.amkor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kbar3.amkor.dto.testDto;

@Repository
@Mapper
public interface AmkorMapper {
	List<testDto> testFind();
}
