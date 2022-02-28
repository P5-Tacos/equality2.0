package com.freekash.springboot.database;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @Size(min = 2, max = 100, message = "Name")
    private String name;

    @NonNull
    @Size(min = 2, max = 1000, message = "Body")
    private String body;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "comment_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Comment comment;

    public Reply(String name, String body, Comment comment){
        this.name = name;
        this.body = body;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
