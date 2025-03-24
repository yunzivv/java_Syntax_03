package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        int lastId = 0;

        List<Motivation> motivations = new ArrayList<>();

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았음");
                continue;
            }

            if (cmd.equals("add")) {
                int id = lastId + 1;
                System.out.print("body : ");
                String body = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();

                Motivation motivation = new Motivation(id, body, source);

                motivations.add(motivation);

                System.out.printf("%d번 motivation이 등록됨\n", id);
                lastId++;
            } else if (cmd.equals("list")) {
                if (motivations.size() == 0) {
                    System.out.println("등록된 moti 없어");
                    continue;
                }

                System.out.println("=".repeat(40));
                System.out.printf("   id    /     source      /      body        \n");

                for (int i = motivations.size() - 1; i >= 0; i--) {
                    Motivation motivation = motivations.get(i);

                    if (motivation.getSource().length() > 7) {
                        System.out.printf("   %d    /     %s     /      %s        \n", motivation.getId(), motivation.getSource().substring(0, 5) + "...", motivation.getBody());
                        continue;
                    }
                    System.out.printf("   %d    /     %s        /      %s        \n", motivation.getId(), motivation.getSource(), motivation.getBody());
                }

                System.out.println("=".repeat(40));
            } else {
                System.out.println("사용할 수 없는 명령어야");
                continue;
            }
        }
    }
}