package com.desktopapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class MainController {
    

    public static Scene CreateScene(Integer id) throws Exception{

        FXMLLoader loader = new FXMLLoader(MainController.class.getResource("mainScreen.fxml"));
        Parent root = loader.load();
        
        MainController controller = loader.getController();
        controller.setId(id);
        controller.btOther.setText(id.toString());
        
        controller.btOther.setPrefHeight(id*(controller.btOther.getPrefHeight()+5));
        controller.btOther.setPrefWidth(id*(controller.btOther.getPrefWidth()+10));
        
        // pegar com do ellipse
        // controller.colorOlhos.setValue();

        return new Scene(root);
    }

    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    Boolean start = false;
    Polygon roupaAtual = null;
    boolean alterName = false;
    Color transparent = new Color(0,0,0,0);

    @FXML
    protected Button btMain;

    @FXML
    protected Button btOther;
 
    @FXML
    protected Label lbMain;
 
    @FXML
    protected Button btCorBranca;
 
    @FXML
    protected Button btCorParda;
 
    @FXML
    protected Button btCorPreta;
 
    @FXML
    protected Circle pele;
 
    @FXML
    protected Circle teste;

    @FXML
    protected Polygon cabelo;

    @FXML
    protected Polygon camisa;

    @FXML
    protected Polygon vestido;
 
    @FXML
    protected ColorPicker colorCabelo;
 
    @FXML
    protected ColorPicker colorRoupa;
 
    @FXML
    protected ColorPicker colorOlhos;
 
    @FXML
    protected Rectangle pescoco;
 
    @FXML
    protected Rectangle bracoDireito;

    @FXML
    protected Rectangle bracoEsquerdo;

    @FXML
    protected Rectangle pernaEsquerda;

    @FXML
    protected Rectangle pernaDireita;

    @FXML
    protected Rectangle tronco;

    @FXML
    protected Ellipse olhoDireito;

    @FXML
    protected Ellipse olhoEsquerdo;

    // VAI SAIR
    @FXML
    protected void onButtonClick(MouseEvent e){

        alterName = !alterName;
        
        lbMain.setText(alterName ? "cristian" : "helena");       
        
    }

    @FXML
    protected void submit(MouseEvent e){

    }

    // MUDAO NÚMERO DOS IDS
    @FXML
    protected void corinthians(MouseEvent e) throws Exception{
        
        Stage crrStage =  (Stage)btOther.getScene().getWindow();
        Scene otherScene = MainController.CreateScene(this.id+1);
        
        crrStage.setScene(otherScene);
    }

    @FXML 
    protected void TrocaCorPele(MouseEvent e) {
        Paint cor = null;
        String button = e.toString().substring(31, 38);

        switch (button) {
            case "btCorBr":
           
                cor = btCorBranca.getTextFill();       
        
                break;
            case "btCorPa":
           
                cor = btCorParda.getTextFill();       
        
                break;
            case "btCorPr":
           
                cor = btCorPreta.getTextFill();       
        
                break;
        
            default:
                break;
        }

        pele.setFill(cor);
        pescoco.setFill(cor);
        bracoEsquerdo.setFill(cor);
        bracoDireito.setFill(cor);
        pernaDireita.setFill(cor);
        pernaEsquerda.setFill(cor);
        tronco.setFill(cor);
    } 

    @FXML 
    protected void TrocarCorCabelo() {
        cabelo.setFill(colorCabelo.getValue());
    } 

    @FXML 
    protected void TrocarCorRoupa() {
        roupaAtual.setFill(colorRoupa.getValue());
    } 

    @FXML 
    protected void TrocarCorOlhos() {
        olhoDireito.setFill(colorOlhos.getValue());
        olhoEsquerdo.setFill(colorOlhos.getValue());
    } 

    @FXML 
    protected void ColocarCamiseta(ActionEvent e) {
        vestido.setFill(transparent);
        vestido.setStroke(transparent);

        camisa.setFill(colorRoupa.getValue());
        camisa.setStroke(btMain.getTextFill()); 

        roupaAtual = camisa;
    } 

    @FXML 
    protected void ColocarVestido(ActionEvent e) {
        camisa.setFill(transparent);
        camisa.setStroke(transparent);
        
        vestido.setFill(colorRoupa.getValue());
        vestido.setStroke(btMain.getTextFill()); 
        
        roupaAtual = vestido;
    } 
}

