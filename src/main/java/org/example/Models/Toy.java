package org.example.Models;

import com.google.gson.Gson;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Toy implements Serializable {

    private int id; //Lombok не дает нам возможности сделать id автоматически, через id++, так что будем считать, что на вход всегда идет верное id (Вообще это решается бд), там оно создается автоматически
    @NonNull
    private String name;
    @NonNull
    private double weight;

    public String toJson() { // Функция для сериализации, потом нам понадобится для записи в файл объекта типа Toy
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
