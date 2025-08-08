package com.skillstorm.InventoryManagementAPI.dtos;

/*
 * DTO = Data Transfer Object
 * we don't always need all the fields from an entity when we're sending data back/forth with the user
 */
public record WarehouseInventoryDTO(int warehouseId, int productId) {

}
