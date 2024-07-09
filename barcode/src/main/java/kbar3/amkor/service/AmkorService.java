package kbar3.amkor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kbar3.amkor.dto.testDto;
import kbar3.amkor.mapper.AmkorMapper;

@Service
public class AmkorService implements AmkorServiceInterface{
	
	@Autowired
	AmkorMapper mapper;

	@Override
	public List<testDto> testFind() {
		// TODO Auto-generated method stub
		return mapper.testFind();
	}

}
