package View;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchView extends JFrame {
    private JTextField searchField;
    private JButton searchButton;
    private JTable resultTable;
    private DefaultTableModel tableModel;
    	
    public SearchView() {
        setTitle("Tìm Kiếm Hồ Sơ");
        //setSize(600, 400);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel để tìm kiếm
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchField = new JTextField(20);
        searchButton = new JButton("Tìm Kiếm");

        searchPanel.add(new JLabel("Nhập tên hoặc số điện thoại:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        // Bảng kết quả
        tableModel = new DefaultTableModel(new Object[]{"Tên", "Số Điện Thoại", "Thông Tin"}, 0);
        resultTable = new JTable(tableModel);
        resultTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(resultTable);

        // Nút xem chi tiết
        JButton viewDetailsButton = new JButton("Xem Chi Tiết");
        viewDetailsButton.setEnabled(false);

        // Lắng nghe sự kiện chọn hàng trong bảng
        resultTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                viewDetailsButton.setEnabled(resultTable.getSelectedRow() != -1);
            }
        });

        viewDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = resultTable.getSelectedRow();
                if (selectedRow != -1) {
                    String name = (String) tableModel.getValueAt(selectedRow, 0);
                    String phone = (String) tableModel.getValueAt(selectedRow, 1);
                    String info = (String) tableModel.getValueAt(selectedRow, 2);
                    JOptionPane.showMessageDialog(SearchView.this, 
                        "Tên: " + name + "\nSố Điện Thoại: " + phone + "\nThông Tin: " + info,
                        "Chi Tiết Hồ Sơ", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        
        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(viewDetailsButton, BorderLayout.SOUTH);

        // Lắng nghe sự kiện tìm kiếm
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText().toLowerCase();
                searchHồSơ(searchText);
            }
        });
    }

    private void searchHồSơ(String searchText) {
        // Xóa nội dung bảng
        tableModel.setRowCount(0);
        
        
        // Bạn có thể thay thế phần này bằng việc truy xuất dữ liệu từ cơ sở dữ liệu
        String[][] dummyData = {
            {"Nguyễn Văn A", "0123456789", "Thao tác tiêm chủng 1"},
            {"Trần Thị B", "0987654321", "Thao tác tiêm chủng 2"},
            {"Lê Văn C", "0123987654", "Thao tác tiêm chủng 3"}
        };
        
        for (String[] data : dummyData) {
            if (data[0].toLowerCase().contains(searchText) || data[1].contains(searchText)) {
                tableModel.addRow(data);
            }
        }
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy hồ sơ nào!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SearchView frame = new SearchView();
            frame.setVisible(true);
        });
    }
}
