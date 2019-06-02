package GUI;

import sportsClub.athlete.Athlete;
import sportsClub.services.*;
import sportsClub.sponsors.Sponsor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UIService {
    private JPanel mainPanel;
    private JPanel find;
    private JTextField textFieldProblems;
    private JTable userTable;

    private JButton powerLifters;
    private JButton athletesUnder35;
    private JButton sponsorsWithBonusMoreThan2000;
    private JButton athletesWithSalaryMoreThan5000;



    public UIService() {
        powerLifters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Athlete>, String> stringSwingWorker = new SwingWorker<List<Athlete>, String>() {
                    @Override
                    protected List<Athlete> doInBackground() throws Exception {
                        return Service.getInstance().powerLifters();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Athlete> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false;
                                        }
                                    };

                                    defaultTableModel.addColumn("Home");
                                    defaultTableModel.addColumn("Salary");
                                    defaultTableModel.addColumn("Name");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Height");
                                    defaultTableModel.addColumn("Weight");
                                    defaultTableModel.addColumn("Sponsor");

                                    for (Athlete ath : result) {
                                        defaultTableModel.addRow(new Object[]{ath.getHome(), ath.getSalary(),
                                                ath.getNume(), ath.getAge(),
                                                ath.getHeight(), ath.getWeight(),
                                                ath.getSponsor()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });

                        }
                        catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });

        athletesUnder35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Athlete>, String> stringSwingWorker = new SwingWorker<List<Athlete>, String>() {
                    @Override
                    protected List<Athlete> doInBackground() throws Exception {
                        return Service.getInstance().athletesUnder35();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Athlete> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false;
                                        }
                                    };

                                    defaultTableModel.addColumn("Home");
                                    defaultTableModel.addColumn("Salary");
                                    defaultTableModel.addColumn("Name");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Height");
                                    defaultTableModel.addColumn("Weight");
                                    defaultTableModel.addColumn("Sponsor");

                                    for (Athlete ath : result) {
                                        defaultTableModel.addRow(new Object[]{ath.getHome(), ath.getSalary(),
                                                ath.getNume(), ath.getAge(),
                                                ath.getHeight(), ath.getWeight(),
                                                ath.getSponsor()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });

                        }
                        catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });

        sponsorsWithBonusMoreThan2000.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Sponsor>, String> stringSwingWorker = new SwingWorker<List<Sponsor>, String>() {
                    @Override
                    protected List<Sponsor> doInBackground() throws Exception {
                        return Service.getInstance().sponsorsWithBonusMoreThan2000();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Sponsor> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false;
                                        }
                                    };

                                    defaultTableModel.addColumn("Logo");
                                    defaultTableModel.addColumn("Bonus");
                                    defaultTableModel.addColumn("Ads");

                                    for (Sponsor spn : result) {
                                        defaultTableModel.addRow(new Object[]{spn.getLogo(), spn.getBonusAwardFromSponsor(),
                                                spn.isAppearsInAds()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });

                        }
                        catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });

        athletesWithSalaryMoreThan5000.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Athlete>, String> stringSwingWorker = new SwingWorker<List<Athlete>, String>() {
                    @Override
                    protected List<Athlete> doInBackground() throws Exception {
                        return Service.getInstance().athletesWithSalaryMoreThan5000();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Athlete> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false;
                                        }
                                    };

                                    defaultTableModel.addColumn("Home");
                                    defaultTableModel.addColumn("Salary");
                                    defaultTableModel.addColumn("Name");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Height");
                                    defaultTableModel.addColumn("Weight");
                                    defaultTableModel.addColumn("Sponsor");

                                    for (Athlete ath : result) {
                                        defaultTableModel.addRow(new Object[]{ath.getHome(), ath.getSalary(),
                                                ath.getNume(), ath.getAge(),
                                                ath.getHeight(), ath.getWeight(),
                                                ath.getSponsor()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });

                        }
                        catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });
    }
}
