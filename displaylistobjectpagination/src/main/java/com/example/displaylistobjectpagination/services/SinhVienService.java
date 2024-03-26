package com.example.displaylistobjectpagination.services;

import com.example.displaylistobjectpagination.models.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface SinhVienService {
    public Page<SinhVien> findPaginated(Pageable pageable);
}
