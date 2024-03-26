package com.example.displaylistobjectpagination.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import com.example.displaylistobjectpagination.models.SinhVien;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    static List<SinhVien> dsSV = new ArrayList<SinhVien>();
    static {
        dsSV.add(new SinhVien("001", "Nguyen Phuc"));
        dsSV.add(new SinhVien("002", "Phan Nguyen"));
        dsSV.add(new SinhVien("003", "Dinh Nguyen"));
        dsSV.add(new SinhVien("004", "Nhat Thien"));
        dsSV.add(new SinhVien("005", "Tin Le"));
        dsSV.add(new SinhVien("006", "Thao Vy"));
        dsSV.add(new SinhVien("007", "Gia Hung"));
        dsSV.add(new SinhVien("008", "Hoai Hung"));
        dsSV.add(new SinhVien("009", "Huy Dao"));
        dsSV.add(new SinhVien("010", "Duc Thang"));
        dsSV.add(new SinhVien("011", "Bao Toan"));
    }

    @Override
    public Page<SinhVien> findPaginated(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;

        List<SinhVien> list;

        if (dsSV.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, dsSV.size());
            list = dsSV.subList(startItem, toIndex);
        }

        Page<SinhVien> sinhVienPage = new PageImpl<SinhVien>(list, PageRequest.of(currentPage, pageSize), dsSV.size());
        return sinhVienPage;
    }

}
