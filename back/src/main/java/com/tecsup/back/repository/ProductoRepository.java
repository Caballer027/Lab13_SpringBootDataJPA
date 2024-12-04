package com.tecsup.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecsup.back.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
