package com.example.javafxangel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;

public class Angel extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Group group = new Group();

        //scene setup
        Scene scene = new Scene(group, 875, 480);
        stage.setScene(scene);
        stage.setTitle("Angelic");
        stage.show();
        drawAngel(437.5,240,50,group);


    }
    public void drawAngel(double x, double y , double size , Group g){
        //circle
        Circle circle = new Circle(x,y,size, Color.GOLD);
        g.getChildren().add(circle);
        circle.setStrokeWidth(3);
        circle.setStroke(Color.SADDLEBROWN);

        //eyes
        Ellipse lEye = new Ellipse(x-22.5,y-7,12,12);
        lEye.setFill(Color.SADDLEBROWN);
        g.getChildren().add(lEye);

        //inside of leye
        Ellipse inLEye = new Ellipse(415,y-2.5,11,9);
        inLEye.setFill(Color.GOLD);
        g.getChildren().add(inLEye);

        //right eye
        Ellipse rEye = new Ellipse(455,y-7,12,12);
        rEye.setFill(Color.SADDLEBROWN);
        g.getChildren().add(rEye);

        //inREye
        Ellipse inREye = new Ellipse(455,y-2.5,11,9);
        inREye.setFill(Color.GOLD);
        g.getChildren().add(inREye);

        //halo
        Ellipse halo = new Ellipse(437.5,180, 40,30);
        halo.setFill(Color.TRANSPARENT);
        halo.setStroke(Color.ROYALBLUE);
        halo.setStrokeWidth(10);

        //shadow
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(10.0); // Blur radius
        dropShadow.setOffsetX(5.0); // Horizontal offset
        dropShadow.setOffsetY(5.0); // Vertical offset
        dropShadow.setColor(Color.GRAY);
        halo.setEffect(dropShadow);

        //lighting
        Distant light = new Distant(); // Define a distant light source
        light.setAzimuth(1000); // Angle of the light source
        light.setElevation(100); // Height of the light source

        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5.0);
        halo.setEffect(lighting);
        g.getChildren().add(halo);

        //smile
        Ellipse smile = new Ellipse(437,264,25,15);
        smile.setFill(Color.SADDLEBROWN);
        g.getChildren().add(smile);

        //inside smile
        Ellipse inSmile = new Ellipse(437,259,28,12);
        inSmile.setFill(Color.GOLD);
        g.getChildren().add(inSmile);

        //smmile lines
//        Arc RLine = new Arc(463,264,7,2,360,180);
//        RLine.setFill(Color.SADDLEBROWN);
//        g.getChildren().add(RLine);
//
//        Arc LLine = new Arc(415,264,7,2,360,180);
//        LLine.setFill(Color.SADDLEBROWN);
//        g.getChildren().add(LLine);


    }
}
