package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws NullPointerException, FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao= (IDao)cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method methode = cMetier.getMethod("setDao", IDao.class);
        methode.invoke(metier,dao);
        System.out.println("Results => " +metier.calcul());

    }
}
