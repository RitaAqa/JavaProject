package lesson3_InheritanceVSPolymorphism.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        int proKey = 123;
        int expKey = 321;
        int inputKey = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input key: ");
        inputKey = Integer.parseInt(br.readLine());

        if (inputKey == proKey) {
            System.out.println("Pro access");
            DocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        } else if (inputKey == expKey) {
            System.out.println("Exp access");
            DocumentWorker exp = new ExpertDocumentWorker();
            exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
        } else {
            System.out.println("Free version");
            DocumentWorker dw = new DocumentWorker();
            dw.openDocument();
            dw.editDocument();
            dw.saveDocument();
        }

    }
}
