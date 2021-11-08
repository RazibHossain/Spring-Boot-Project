package com.razib.springboot.project.springBootProject.Service;

import com.razib.springboot.project.springBootProject.Dao.BatchDao;
import com.razib.springboot.project.springBootProject.model.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchService {

    @Autowired
    BatchDao batchDao;

    public void saveBatch(Batch batch){
        //add validation
        batchDao.save(batch);

    }
    public List<Batch> getBatch(){
       return batchDao.findAll();
    }
}
