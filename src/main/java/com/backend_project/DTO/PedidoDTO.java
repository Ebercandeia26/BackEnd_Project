package com.backend_project.DTO;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDTO {
	
	private Long id;
	private Double valorPedido;
	private Double taxaEntrega;
	private LocalDate dataPedido;
}
