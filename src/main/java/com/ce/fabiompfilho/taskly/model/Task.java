package com.ce.fabiompfilho.taskly.model;

import com.ce.fabiompfilho.taskly.enums.StatusEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.Objects;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Size(message = "title must have a max of 50 chars", max = 50)
    @NotEmpty(message = "field title can't be null")
    @Column(nullable = false, length = 50)
    private String title;

    @NotEmpty(message = "field description can't be null")
    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDate createdAt;

    @Column(nullable = false)
    @NotNull(message = "field date can't be null")
    private LocalDate dueDate;

    @NotNull(message = "field status can't be null")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusEnum status;

//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;

//    private User user;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Task task = (Task) o;
        return getId() != null && Objects.equals(getId(), task.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
