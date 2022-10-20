package com.example.awss3.service;

import com.example.awss3.domain.GalleryEntity;
import com.example.awss3.domain.GalleryRepository;
import com.example.awss3.dto.GalleryDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GalleryService {
    private GalleryRepository galleryRepository;

    public void savePost(GalleryDto galleryDto) {
        galleryRepository.save(galleryDto.toEntity());
    }

    public List<GalleryEntity> getAllGallery() {
        List<GalleryEntity> all = galleryRepository.findAll();
        return all;
    }
}
