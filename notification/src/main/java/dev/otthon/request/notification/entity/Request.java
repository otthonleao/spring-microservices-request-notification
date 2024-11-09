package dev.otthon.request.notification.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import dev.otthon.request.notification.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private UUID id = UUID.randomUUID();
    private String client;
    private List<RequestItem> itens = new ArrayList<>();
    private Double total;
    private String emailNotification;
    private String status = Status.PROCESSING.name();

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime = LocalDateTime.now();


}
