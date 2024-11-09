package dev.otthon.request.notification.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestItem {

    private UUID id = UUID.randomUUID();
    private Product product;
    private Integer quantity;

}
