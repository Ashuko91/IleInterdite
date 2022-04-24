package Modele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Controleur extends JPanel {
    private Random random = new Random();
    public Controleur(Ile ile) {

            JButton haut = new JButton("↑");
            haut.setPreferredSize(new Dimension(50,40));
            this.add(haut);

            haut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (ile.getJ1().tour){
                        if (ile.getJ1().getCaseJoueur().getY() > 0 && ile.getJ1().getActionsRestantes() > 0) {
                            ile.getJ1().deplacement(ile.getJ1(), "haut");
                            ile.getJ1().decreaseAction();
                            ile.testwin();
                        }
                    }else if (ile.getJ2().tour){
                        if (ile.getJ2().getCaseJoueur().getY() > 0 && ile.getJ2().getActionsRestantes() > 0) {
                            ile.getJ2().deplacement(ile.getJ2(), "haut");
                            ile.getJ2().decreaseAction();
                            ile.testwin();
                        }
                    }else if (ile.getJ3().tour){
                        if (ile.getJ3().getCaseJoueur().getY() > 0 && ile.getJ3().getActionsRestantes() > 0) {
                            ile.getJ3().deplacement(ile.getJ3(), "haut");
                            ile.getJ3().decreaseAction();
                            ile.testwin();
                        }
                    }else if (ile.getJ4().tour){
                        if (ile.getJ4().getCaseJoueur().getY() > 0 && ile.getJ4().getActionsRestantes() > 0) {
                            ile.getJ4().deplacement(ile.getJ4(), "haut");
                            ile.getJ4().decreaseAction();
                            ile.testwin();
                        }
                    }
                   }

            });


            JButton bas = new JButton("↓");
            bas.setPreferredSize(new Dimension(50,40));
            this.add(bas);

            bas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ile.getJ1().tour){
                    if (ile.getJ1().getCaseJoueur().getY() < 5 && ile.getJ1().getActionsRestantes() > 0) {
                        ile.getJ1().deplacement(ile.getJ1(), "bas");
                        ile.getJ1().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ2().tour){
                    if (ile.getJ2().getCaseJoueur().getY() < 5 && ile.getJ2().getActionsRestantes() > 0) {
                        ile.getJ2().deplacement(ile.getJ2(), "bas");
                        ile.getJ2().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ3().tour){
                    if (ile.getJ3().getCaseJoueur().getY() < 5 && ile.getJ3().getActionsRestantes() > 0) {
                        ile.getJ3().deplacement(ile.getJ3(), "bas");
                        ile.getJ3().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ4().tour){
                    if (ile.getJ4().getCaseJoueur().getY() < 5 && ile.getJ4().getActionsRestantes() > 0) {
                        ile.getJ4().deplacement(ile.getJ4(), "bas");
                        ile.getJ4().decreaseAction();
                        ile.testwin();
                    }
                }
            }
            });

            JButton droite = new JButton("→");
            droite.setPreferredSize(new Dimension(50,40));
            this.add(droite);

            droite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ile.getJ1().tour){
                    if (ile.getJ1().getCaseJoueur().getX() < 5 && ile.getJ1().getActionsRestantes() > 0) {
                        ile.getJ1().deplacement(ile.getJ1(), "droite");
                        ile.getJ1().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ2().tour){
                    if (ile.getJ2().getCaseJoueur().getX() < 5 && ile.getJ2().getActionsRestantes() > 0) {
                        ile.getJ2().deplacement(ile.getJ2(), "droite");
                        ile.getJ2().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ3().tour){
                    if (ile.getJ3().getCaseJoueur().getX() < 5 && ile.getJ3().getActionsRestantes() > 0) {
                        ile.getJ3().deplacement(ile.getJ3(), "droite");
                        ile.getJ3().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ4().tour){
                    if (ile.getJ4().getCaseJoueur().getX() < 5 && ile.getJ4().getActionsRestantes() > 0) {
                        ile.getJ4().deplacement(ile.getJ4(), "droite");
                        ile.getJ4().decreaseAction();
                        ile.testwin();
                    }
                }
            }
            });

            JButton gauche = new JButton("←");
            gauche.setPreferredSize(new Dimension(50,40));
            this.add(gauche);

            gauche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ile.getJ1().tour){
                    if (ile.getJ1().getCaseJoueur().getX() > 0 && ile.getJ1().getActionsRestantes() > 0) {
                        ile.getJ1().deplacement(ile.getJ1(), "gauche");
                        ile.getJ1().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ2().tour){
                    if (ile.getJ2().getCaseJoueur().getX() > 0 && ile.getJ2().getActionsRestantes() > 0) {
                        ile.getJ2().deplacement(ile.getJ2(), "gauche");
                        ile.getJ2().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ3().tour){
                    if (ile.getJ3().getCaseJoueur().getX() > 0 && ile.getJ3().getActionsRestantes() > 0) {
                        ile.getJ3().deplacement(ile.getJ3(), "gauche");
                        ile.getJ3().decreaseAction();
                        ile.testwin();
                    }
                }else if (ile.getJ4().tour){
                    if (ile.getJ4().getCaseJoueur().getX() > 0 && ile.getJ4().getActionsRestantes() > 0) {
                        ile.getJ4().deplacement(ile.getJ4(), "gauche");
                        ile.getJ4().decreaseAction();
                        ile.testwin();
                    }
                }
            }
            });

        JButton assecher = new JButton("Asseche");
        assecher.setPreferredSize(new Dimension(150,40));
        this.add(assecher);

        assecher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ile.getJ1().tour){
                    if (ile.getJ1().getActionsRestantes() > 0) {
                        System.out.println(ile.getJ1().getCaseJoueur().getX());
                        System.out.println(ile.getJ1().getCaseJoueur().getY());
                        ile.getJ1().getCaseJoueur().assecheZone();
                        ile.getJ1().decreaseAction();

                    }
                }else if (ile.getJ2().tour){
                    if (ile.getJ2().getCaseJoueur().getEtat().equals("INONDEE") && ile.getJ2().getActionsRestantes() > 0) {
                        ile.getJ2().getCaseJoueur().assecheZone();
                        ile.getJ2().decreaseAction();
                    }
                }else if (ile.getJ3().tour){
                    if (ile.getJ3().getCaseJoueur().getEtat().equals("INONDEE") && ile.getJ3().getActionsRestantes() > 0) {
                        ile.getJ3().getCaseJoueur().assecheZone();
                        ile.getJ3().decreaseAction();
                    }
                }else if (ile.getJ4().tour){
                    if (ile.getJ4().getCaseJoueur().getEtat().equals("INONDEE") && ile.getJ4().getActionsRestantes() > 0) {
                        ile.getJ4().getCaseJoueur().assecheZone();
                        ile.getJ4().decreaseAction();
                    }
                }





            }

        });

        JButton rammasse = new JButton("Rammasse");
        rammasse.setPreferredSize(new Dimension(150,40));
        this.add(rammasse);

        rammasse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ile.getJ1().tour){
                    if (ile.getJ1().getActionsRestantes() > 0) {
                        System.out.println(ile.getJ1().getCaseJoueur().getX());
                        System.out.println(ile.getJ1().getCaseJoueur().getY());
                        ile.getJ1().rammasseArtefact();
                        ile.getJ1().decreaseAction();

                    }
                }else if (ile.getJ2().tour){
                    if (ile.getJ2().getCaseJoueur().getEtat().equals("INONDEE") && ile.getJ2().getActionsRestantes() > 0) {
                        ile.getJ2().getCaseJoueur().assecheZone();
                        ile.getJ2().rammasseArtefact();
                        ile.getJ2().decreaseAction();
                    }
                }else if (ile.getJ3().tour){
                    if (ile.getJ3().getCaseJoueur().getEtat().equals("INONDEE") && ile.getJ3().getActionsRestantes() > 0) {
                        ile.getJ3().getCaseJoueur().assecheZone();
                        ile.getJ3().rammasseArtefact();
                        ile.getJ3().decreaseAction();
                    }
                }else if (ile.getJ4().tour){
                    if (ile.getJ4().getCaseJoueur().getEtat().equals("INONDEE") && ile.getJ4().getActionsRestantes() > 0) {
                        ile.getJ4().getCaseJoueur().assecheZone();
                        ile.getJ4().rammasseArtefact();
                        ile.getJ4().decreaseAction();
                    }
                }





            }

        });
            JButton findetour = new JButton("Fin de Tour");
            findetour.setPreferredSize(new Dimension(150,40));
            this.add(findetour);

            findetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ile.randomFinDeTour();
                int x = random.nextInt(0,100);
                int y = random.nextInt(0,3);
                Cle c = new Cle("FEU");
                switch(y) {
                    case 0: c.setE("FEU");;break;
                    case 1: c.setE("EAU");break;
                    case 2: c.setE("TERRE");break;
                    case 3: c.setE("AIR");break;
                }

                if (ile.getJ1().tour) {
                    if (x>0 && x<=33){
                        ile.getJ1().setCles(c);
                    }else if (x >= 34 && x<=66){
                        ile.getJ1().getCaseJoueur().setEtat("INONDEE");
                    }
                    ile.getJ1().setTour(false);
                    ile.getJ1().setActionsRestantes(3);
                    ile.getJ2().setTour(true);
                } else if (ile.getJ2().tour) {
                    if (x>0 && x<33){
                        ile.getJ2().setCles(c);
                    }else if (x >= 34 && x<=66){
                        ile.getJ2().getCaseJoueur().setEtat("INONDEE");
                    }
                    ile.getJ2().setTour(false);
                    ile.getJ2().setActionsRestantes(3);
                    ile.getJ3().setTour(true);
                } else if (ile.getJ3().tour) {
                    if (x>0 && x<33){
                        ile.getJ3().setCles(c);
                    }else if (x >= 34 && x<=66){
                        ile.getJ3().getCaseJoueur().setEtat("INONDEE");
                    }
                    ile.getJ3().setTour(false);
                    ile.getJ3().setActionsRestantes(3);
                    ile.getJ4().setTour(true);
                } else if (ile.getJ4().tour) {
                    if (x>0 && x<33){
                        ile.getJ4().setCles(c);
                    }else if (x >= 34 && x<=66){
                        ile.getJ4().getCaseJoueur().setEtat("INONDEE");
                    }
                    ile.getJ4().setTour(false);
                    ile.getJ4().setActionsRestantes(3);
                    ile.getJ1().setTour(true);

                }

            }
            }
            );


        }
}
