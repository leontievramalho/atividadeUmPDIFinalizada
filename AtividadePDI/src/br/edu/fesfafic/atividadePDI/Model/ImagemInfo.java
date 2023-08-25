package br.edu.fesfafic.atividadePDI.Model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagemInfo {
    public static void extrairVermelho(BufferedImage imagem) throws IOException {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        BufferedImage novaImg = new BufferedImage(largura, altura, 1);

        for(int coluna = 0; coluna < largura; coluna++){
            for(int linha = 0; linha < altura; linha++){
                int pixel = imagem.getRGB(coluna, linha);
                Color cor = new Color(pixel);
                if(cor.getBlue()<70 && cor.getGreen() < 70 && cor.getRed() > 100){
                    novaImg.setRGB(coluna, linha, pixel);
                }
            }
        }
        ImageIO.write(novaImg, "jpeg", new File("C:\\Users\\leont\\Documents\\Projetos Java\\AtividadePDI\\src\\br\\edu\\fesfafic\\atividadePDI\\Images\\novaIMGVermelho.jpg"));

        JFrame janela = new JFrame();

        ImageIcon icone = new ImageIcon(novaImg);
        JLabel label = new JLabel(icone);

        janela.add(label);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }

    public static void extrairAzul(BufferedImage imagem) throws IOException {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        BufferedImage novaImg = new BufferedImage(largura, altura, 1);

        for(int coluna = 0; coluna < largura; coluna++){
            for(int linha = 0; linha < altura; linha++){
                int pixel = imagem.getRGB(coluna, linha);
                Color cor = new Color(pixel);
                if(cor.getBlue()>100 && cor.getGreen() < 100 && cor.getRed() < 70){
                    novaImg.setRGB(coluna, linha, pixel);
                }
            }
        }
        ImageIO.write(novaImg, "jpeg", new File("C:\\Users\\leont\\Documents\\Projetos Java\\AtividadePDI\\src\\br\\edu\\fesfafic\\atividadePDI\\Images\\novaIMGAzul.jpg"));

        JFrame janela = new JFrame();

        ImageIcon icone = new ImageIcon(novaImg);
        JLabel label = new JLabel(icone);

        janela.add(label);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }

    public static void extrairAmarelo(BufferedImage imagem) throws IOException {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        BufferedImage novaImg = new BufferedImage(largura, altura, 1);

        for(int coluna = 0; coluna < largura; coluna++){
            for(int linha = 0; linha < altura; linha++){
                int pixel = imagem.getRGB(coluna, linha);
                Color cor = new Color(pixel);
                if(cor.getBlue()<70 && cor.getGreen() > 100 && cor.getRed() > 100){
                    novaImg.setRGB(coluna, linha, pixel);
                }
            }
        }
        ImageIO.write(novaImg, "jpeg", new File("C:\\Users\\leont\\Documents\\Projetos Java\\AtividadePDI\\src\\br\\edu\\fesfafic\\atividadePDI\\Images\\novaIMGAmarelo.jpg"));

        JFrame janela = new JFrame();

        ImageIcon icone = new ImageIcon(novaImg);
        JLabel label = new JLabel(icone);

        janela.add(label);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}
