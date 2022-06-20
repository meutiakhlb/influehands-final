package capstone.project.influehands.service;

import java.util.List;

import capstone.project.influehands.model.BrandModel;
import capstone.project.influehands.repository.BrandDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandDb brandDb;

    @Override
    public boolean saveBrand(BrandModel brand){
        brandDb.save(brand);
        return true;
    }
    

}