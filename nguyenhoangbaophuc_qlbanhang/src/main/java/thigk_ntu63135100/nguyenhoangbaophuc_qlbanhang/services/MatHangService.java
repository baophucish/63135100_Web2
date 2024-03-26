package thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.services;

import org.springframework.stereotype.Service;

import thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.models.MatHang;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public interface MatHangService {
    public Page<MatHang> findPaginated(Pageable pageable);
}
