package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    
        // Getter dan setter untuk id
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    // Getters and Setters
}
