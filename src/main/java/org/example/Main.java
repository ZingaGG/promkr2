package org.example;


import org.example.Models.MarketPlaceDraw;
import org.example.Models.Toy;

public class Main {
    // Программа разыгрывает игрушку, можно добавить игрушку, можно изменить ее имя или вес,
    // ошибки возможные ошибки обрабатываются внутри классов
    public static void main(String[] args) {
        MarketPlaceDraw marketPlaceDraw = new MarketPlaceDraw();
        Toy toy = new Toy("Check", 25);


        marketPlaceDraw.addToy(toy); // Функция добавления игрушки
        marketPlaceDraw.editToyName(0, "CarCheck"); // Функция изменения имени игрушки(Специально написано ошибочно)
        marketPlaceDraw.editToyWeight(1, 23); // Функция изменения веса игрушки
        marketPlaceDraw.draw();
    }
}