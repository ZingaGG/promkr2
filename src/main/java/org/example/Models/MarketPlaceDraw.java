package org.example.Models;

import lombok.*;
import org.example.Service.FileService;
import org.example.Service.IFileService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public class MarketPlaceDraw {
    private static int ID;
    private List<Toy> toys;
    private IFileService fileService = new FileService();

    {
        toys = new ArrayList<>();

        toys.add(new Toy(++ID, "Car", 25));
        toys.add(new Toy(++ID, "Doll", 25));
        toys.add(new Toy(++ID, "Teddy", 25));
        toys.add(new Toy(++ID, "Ball", 25));
    }

    public void addToy(Toy toy){
        toy.setId(++ID);
        toys.add(toy);
    }

    public void editToyName(int id, String name){
        try {
            Toy toyToEdit = toys.get(id-1);
            toyToEdit.setName(name);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong id while editing name!");
        }

    }

    public void editToyWeight(int id, double weight){
        try {
            Toy toyToEdit = toys.get(id-1);
            toyToEdit.setWeight(weight);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong id while editing weight!");
        }
    }

    public Toy draw(){
        Random random = new Random();
        int randomInt = random.nextInt(toys.size());
        fileService.writePrize(toys.get(randomInt));
        return toys.get(randomInt);
    }
}
