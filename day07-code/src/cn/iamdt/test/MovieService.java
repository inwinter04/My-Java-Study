package cn.iamdt.test;

import cn.iamdt.domain.Movie;

import java.util.Scanner;

public class MovieService {
    private Movie[] movies;
    private Scanner sc = new Scanner(System.in);

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    /**
     * 启动电影信息管理系统
     */
    public void start() {
        lo:
        while (true) {
            System.out.println("-------电影信息系统-------");
            System.out.println("请输入您的选择：");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据id查询电影信息");
            System.out.println("3. 退出");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queryMoveInfo();
                    break;
                case 2:
                    queryMoveById();
                    break;
                case 3:
                    System.out.println("感谢您的使用，再见！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请检查");
                    break;
            }
        }
    }

    /**
     * 使用ID查询指定电影信息
     */
    private void queryMoveById() {
        System.out.print("请输入您要查询电影的ID：");
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println(movies[i].getId() + "---" + movies[i].getTitle()
                        + "---" + movies[i].getTime() + "---" + movies[i].getScore()
                        + "---" + movies[i].getArea() + "---" + movies[i].getType()
                        + "---" + movies[i].getDirector() + "---" + movies[i].getStarring());
                return;
            }
        }
        System.out.println("无效ID，请检查！");
    }

    /**
     * 查询全部电影信息（ID + 名称 + 评分）
     */
    private void queryMoveInfo() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println("ID:" + movies[i].getId()
                    + " 名称：" + movies[i].getTitle()
                    + " 评分：" + movies[i].getScore());
        }
    }
}
