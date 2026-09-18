package monitor.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
	public String format(LocalDateTime data) {
		DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return data.format(formato);
	}
}
