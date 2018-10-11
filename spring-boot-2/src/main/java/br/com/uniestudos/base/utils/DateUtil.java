package br.com.uniestudos.base.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    public String formateLocalDateTimeToDatabaseStyle(LocalDateTime dateTime) {
        return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss").format(dateTime);
    }
}
