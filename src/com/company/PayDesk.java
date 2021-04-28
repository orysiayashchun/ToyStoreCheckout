package com.company;
import Posterity.Designer;
import Posterity.Puzzle;
import Posterity.SoftToy;

import javax.script.ScriptException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class PayDesk {

    public static void main(String[] args)   {
        ArrayList<Designer> listOfDesigners = new ArrayList<Designer>();
        ArrayList<Puzzle> listOfPuzzles = new ArrayList<Puzzle>();
        ArrayList<SoftToy> listOfSoftToys = new ArrayList<SoftToy>();

        generateDesigners(listOfDesigners);
        generatePuzzles(listOfPuzzles);
        generateSoftToys(listOfSoftToys);
        while (true){
            System.out.println("Оберіть дію:");
            System.out.println("1. Купити конструктор");
            System.out.println("2. Купити пазли");
            System.out.println("3. Купити м'яку іграшку");
            System.out.println("4. Додати іграшку");
            System.out.println("5. Вийти");
            Scanner in= new Scanner(System.in);
            int chooseItem=in.nextInt();
            switch (chooseItem){
                case 1:
                    buyDesigner(listOfDesigners);
                    break;
                case 2:
                    buyPuzzle(listOfPuzzles);
                    break;
                case 3:
                    buySoftToy(listOfSoftToys);
                    break;
                case 4:
                    addToy(listOfDesigners,listOfPuzzles,listOfSoftToys);
                    break;
                case  5:
                    System.out.println("Вихід");
                    System.exit(0);
                default:
                    System.out.println("Помилка вибору, спробуйте ще раз!");
            }
        }
    }

    private static void generateDesigners(ArrayList<Designer> list){
        list.add(new Designer("1a", 120.5F,100));
        list.add(new Designer("1b", 150.5F,120));
    }
    private static void generatePuzzles(ArrayList<Puzzle> list){
        list.add(new Puzzle("2a",80.3F,200));
        list.add(new Puzzle("2b",120.3F,500));
    }
    private static void generateSoftToys(ArrayList<SoftToy> list){
        list.add(new SoftToy("3a",250.4F,true));
        list.add(new SoftToy("3b",120.6F,false));
    }
    private static void buyDesigner(ArrayList<Designer> list) throws ArrayIndexOutOfBoundsException {
        Scanner in= new Scanner(System.in);
        System.out.println("Оберіть конструктор:");
        int i=1;
        Iterator<Designer> designerIterator =list.iterator();
        while(designerIterator.hasNext()){
            System.out.println(i+". "+designerIterator.next());
            i+=1;
        }
        int choose=in.nextInt();
        if (choose<=0||choose>list.size()){
            throw new ArrayIndexOutOfBoundsException("Конструктора з індексом "+ choose+ " не існує");
        }
        list.remove(choose-1);
        System.out.println("Дякуємо за покупку!");
    }
    private static void buyPuzzle(ArrayList<Puzzle> list) throws ArrayIndexOutOfBoundsException{
        Scanner in= new Scanner(System.in);
        System.out.println("Оберіть пазли:");
        int i=1;
        Iterator<Puzzle> puzzleIterator =list.iterator();
        while(puzzleIterator.hasNext()){
            System.out.println(i+". "+puzzleIterator.next());
            i+=1;
        }
        int choose=in.nextInt();
        System.out.println(list.size());
        if (choose<=0||choose>list.size()){
            throw new ArrayIndexOutOfBoundsException("Конструктора з індексом "+ choose+ " не існує");
        }
        list.remove(choose-1);
        System.out.println("Дякуємо за покупку!");
    }
    private static void buySoftToy(ArrayList<SoftToy> list) throws ArrayIndexOutOfBoundsException{
        Scanner in= new Scanner(System.in);
        System.out.println("Оберіть м'яку іграшку:");
        int i=1;
        Iterator<SoftToy> softToyIterator =list.iterator();
        while(softToyIterator.hasNext()){
            System.out.println(i+". "+softToyIterator.next());
            i+=1;
        }
        int choose=in.nextInt();
        if (choose<=0||choose>list.size()){
            throw new ArrayIndexOutOfBoundsException("М'якої іграшки з індексом "+ choose+ " не існує");
        }
        list.remove(choose-1);
        System.out.println("Дякуємо за покупку!");
    }
    private static void addToy(ArrayList<Designer> list1,
                               ArrayList<Puzzle> list2,
                               ArrayList<SoftToy> list3) {
        System.out.println("1. Додати конструктор");
        System.out.println("2. Дадати пазли");
        System.out.println("3. Додати м'яку іграшку");
        Scanner in = new Scanner(System.in);
        int chooseItem = in.nextInt();
        switch (chooseItem) {
            case 1:
                addDesigner(list1);
                break;
            case 2:
                addPuzzle(list2);
                break;
            case 3:
                addSoftToy(list3);
                break;
            default:
                System.out.println("Помилка вибору, спробуйте ще раз!");
                break;
        }
    }
    private static void addDesigner(ArrayList<Designer> list) throws InputMismatchException{
        Scanner in= new Scanner(System.in);
        System.out.println("Введіть артикул:");
        String article=in.nextLine();
        try{
            System.out.println("Введіть ціну:");
            float  price= in.nextFloat();
            System.out.println("Введіть кількість елементів конструктора:");
            int elements= in.nextInt();
            list.add(new Designer(article,price,elements));
        }
        catch (InputMismatchException e){
            System.err.println("Неправельний тип даних");
            e.printStackTrace();
        }
    }
    private static void addPuzzle(ArrayList<Puzzle> list) throws InputMismatchException{
        Scanner in= new Scanner(System.in);
        System.out.println("Введіть артикул:");
        String article=in.nextLine();
        try{
            System.out.println("Введіть ціну:");
            float price= in.nextFloat();
            System.out.println("Введіть кількість пазлів:");
            int elements= in.nextInt();
            list.add(new Puzzle(article,price,elements));
        }
        catch (InputMismatchException e){
            System.err.println("Неправельний тип даних");
            e.printStackTrace();
        }
    }
    private static void addSoftToy(ArrayList<SoftToy> list){
        Scanner in= new Scanner(System.in);
        System.out.println("Введіть артикул:");
        String article=in.nextLine();
        try{
            System.out.println("Введіть ціну:");
            float price= in.nextFloat();
            System.out.println("Введіть чи іграшка має здатність говорити:");
            Boolean speak= in.nextBoolean();
            list.add(new SoftToy(article,price,speak));
        }
        catch (InputMismatchException e){
            System.err.println("Неправельний тип даних");
            e.printStackTrace();
        }
    }
}
