package thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.services;

import thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.models.MatHang;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Collections;

public class MatHangServiceImpl implements MatHangService {
    static List<MatHang> dsMatHang = new ArrayList<MatHang>();

    static {
        dsMatHang.add(new MatHang("001", "Quan Kaki", 10, ""));
        dsMatHang.add(new MatHang("002", "Ao thun den", 20, ""));
        dsMatHang.add(new MatHang("003", "Quan Jean", 20, ""));
        dsMatHang.add(new MatHang("004", "Ao ba lo", 10, ""));
        dsMatHang.add(new MatHang("005", "Quan short", 10, ""));
        dsMatHang.add(new MatHang("006", "Ao khoac da", 10, ""));
        dsMatHang.add(new MatHang("007", "Ao so mi", 10, ""));
        dsMatHang.add(new MatHang("008", "Giay the thao", 20, ""));
    }

    @Override
    public Page<MatHang> findPaginated(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<MatHang> list;
        if (dsMatHang.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, dsMatHang.size());
            list = dsMatHang.subList(startItem, toIndex);
        }
        Page<MatHang> matHangPage = new PageImpl<MatHang>(list, PageRequest.of(currentPage, pageSize),
                dsMatHang.size());
        return matHangPage;
    }
}
