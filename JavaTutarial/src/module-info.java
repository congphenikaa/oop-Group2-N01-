module JavaTutarial {
	requires javafx.controls;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens KhoiDong;
	exports javafx;
}
