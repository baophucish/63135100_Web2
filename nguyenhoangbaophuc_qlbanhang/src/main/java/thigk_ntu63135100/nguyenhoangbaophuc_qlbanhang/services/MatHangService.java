package thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.services;

import org.springframework.stereotype.Service;

import thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.models.MatHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatHangService {

    // Danh sách sản phẩm hard-coded
    private List<MatHang> dsMH = new ArrayList<>();

    public MatHangService() {
        // Thêm các sản phẩm vào danh sách khi khởi tạo service
        dsMH.add(new MatHang("P001", "Product 1", 100, ""));
        dsMH.add(new MatHang("P002", "Product 2", 200, ""));
        dsMH.add(new MatHang("P003", "Product 3", 300, ""));
    }

    // Tìm kiếm sản phẩm theo mã
    public Optional<MatHang> findProductById(String id) {
        return dsMH.stream()
                .filter(mathang -> mathang.getMaMH().equals(id))
                .findFirst();
    }

    // Trả về toàn bộ danh sách sản phẩm
    public List<MatHang> getAllProducts() {
        return dsMH;
    }

    // Thêm một sản phẩm mới vào danh sách
    public void themMH(MatHang mh) {
        dsMH.add(mh);
    }
}
