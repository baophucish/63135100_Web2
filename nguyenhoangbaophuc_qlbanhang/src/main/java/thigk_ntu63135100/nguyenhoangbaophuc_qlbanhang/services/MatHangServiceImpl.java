package thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.services;

import thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.models.MatHang;

import java.util.List;
import java.util.ArrayList;

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
}
