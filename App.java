/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taaasks;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.Box;
import javax.swing.BoxLayout;


public class App extends javax.swing.JFrame {
    private static ArrayList<Task> toDoTasks;
    private static ArrayList<Task> doingTasks;
    private static ArrayList<Task> doneTasks;
    private static int currentTasks;
    private int numberOfTasks;
    
    public App() {
        toDoTasks = new ArrayList<>();
        doingTasks = new ArrayList<>();
        doneTasks = new ArrayList<>();
        initComponents();
        numberOfTasks = 0;
        currentTasks = 0;
        totalTasks.setText("0");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        toDoContainer = new javax.swing.JPanel();
        addTask = new javax.swing.JButton();
        projectNameContainer = new javax.swing.JPanel();
        projectNameLabel = new javax.swing.JLabel();
        projectName = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        dateCreatedContainer = new javax.swing.JPanel();
        projectDateLabel = new javax.swing.JLabel();
        projectDate = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        totalTasksContainer = new javax.swing.JPanel();
        totalTasksLabel = new javax.swing.JLabel();
        totalTasks = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        toDoTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doneContainer = new javax.swing.JPanel();
        doingTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        doingContainer = new javax.swing.JPanel();
        doneTitle = new javax.swing.JLabel();
        progressContainer = new javax.swing.JPanel();
        progressLabel = new javax.swing.JLabel();
        projectProgress = new javax.swing.JProgressBar();
        progressPercentage = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taaasks");
        setBackground(new java.awt.Color(247, 247, 255));
        setPreferredSize(new java.awt.Dimension(1192, 750));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));

        userName.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Good Morning, {Name}");

        jScrollPane1.setBackground(new java.awt.Color(30, 30, 30));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(280, 5));

        toDoContainer.setBackground(new java.awt.Color(54, 53, 59));
        toDoContainer.setMaximumSize(new java.awt.Dimension(350, 0));
        toDoContainer.setMinimumSize(new java.awt.Dimension(350, 0));
        toDoContainer.setLayout(new javax.swing.BoxLayout(toDoContainer, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(toDoContainer);

        addTask.setBackground(new java.awt.Color(30, 30, 30));
        addTask.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        addTask.setForeground(new java.awt.Color(255, 255, 255));
        addTask.setText("+");
        addTask.setToolTipText("Create new task");
        addTask.setBorder(null);
        addTask.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskActionPerformed(evt);
            }
        });

        projectNameContainer.setBackground(new java.awt.Color(54, 53, 59));
        projectNameContainer.setMaximumSize(new java.awt.Dimension(180, 32767));
        projectNameContainer.setMinimumSize(new java.awt.Dimension(180, 0));
        projectNameContainer.setPreferredSize(new java.awt.Dimension(180, 58));

        projectNameLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        projectNameLabel.setForeground(new java.awt.Color(204, 203, 211));
        projectNameLabel.setText("Project name");

        projectName.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        projectName.setForeground(new java.awt.Color(255, 255, 255));
        projectName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        projectName.setText("Project Name");

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taaasks/media/cube.png"))); // NOI18N

        javax.swing.GroupLayout projectNameContainerLayout = new javax.swing.GroupLayout(projectNameContainer);
        projectNameContainer.setLayout(projectNameContainerLayout);
        projectNameContainerLayout.setHorizontalGroup(
            projectNameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectNameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectNameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectNameLabel)
                    .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        projectNameContainerLayout.setVerticalGroup(
            projectNameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectNameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(projectNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectName)
                .addGap(15, 15, 15))
        );

        dateCreatedContainer.setBackground(new java.awt.Color(54, 53, 59));
        dateCreatedContainer.setMaximumSize(new java.awt.Dimension(180, 32767));
        dateCreatedContainer.setMinimumSize(new java.awt.Dimension(180, 0));
        dateCreatedContainer.setPreferredSize(new java.awt.Dimension(180, 58));

        projectDateLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        projectDateLabel.setForeground(new java.awt.Color(204, 203, 211));
        projectDateLabel.setText("Created on");

        projectDate.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        projectDate.setForeground(new java.awt.Color(255, 255, 255));
        projectDate.setText("Date Created");

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taaasks/media/calendar.png"))); // NOI18N

        javax.swing.GroupLayout dateCreatedContainerLayout = new javax.swing.GroupLayout(dateCreatedContainer);
        dateCreatedContainer.setLayout(dateCreatedContainerLayout);
        dateCreatedContainerLayout.setHorizontalGroup(
            dateCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateCreatedContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectDate)
                    .addComponent(projectDateLabel)
                    .addComponent(icon2))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        dateCreatedContainerLayout.setVerticalGroup(
            dateCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateCreatedContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(projectDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectDate)
                .addGap(11, 11, 11))
        );

        totalTasksContainer.setBackground(new java.awt.Color(54, 53, 59));
        totalTasksContainer.setMaximumSize(new java.awt.Dimension(180, 32767));
        totalTasksContainer.setMinimumSize(new java.awt.Dimension(180, 0));
        totalTasksContainer.setPreferredSize(new java.awt.Dimension(180, 58));

        totalTasksLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        totalTasksLabel.setForeground(new java.awt.Color(204, 203, 211));
        totalTasksLabel.setText("Total tasks");

        totalTasks.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        totalTasks.setForeground(new java.awt.Color(255, 255, 255));
        totalTasks.setText("Total Tasks");

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taaasks/media/analytics.png"))); // NOI18N

        javax.swing.GroupLayout totalTasksContainerLayout = new javax.swing.GroupLayout(totalTasksContainer);
        totalTasksContainer.setLayout(totalTasksContainerLayout);
        totalTasksContainerLayout.setHorizontalGroup(
            totalTasksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalTasksContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalTasksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTasks)
                    .addComponent(totalTasksLabel)
                    .addComponent(icon3))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        totalTasksContainerLayout.setVerticalGroup(
            totalTasksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalTasksContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalTasksLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalTasks)
                .addGap(11, 11, 11))
        );

        toDoTitle.setFont(new java.awt.Font("Futura", 1, 16)); // NOI18N
        toDoTitle.setForeground(new java.awt.Color(255, 255, 255));
        toDoTitle.setText("To do");

        jScrollPane2.setBackground(new java.awt.Color(30, 30, 30));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMinimumSize(new java.awt.Dimension(280, 5));

        doneContainer.setBackground(new java.awt.Color(54, 53, 59));
        doneContainer.setMaximumSize(new java.awt.Dimension(350, 0));
        doneContainer.setMinimumSize(new java.awt.Dimension(350, 0));
        doneContainer.setLayout(new javax.swing.BoxLayout(doneContainer, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(doneContainer);

        doingTitle.setFont(new java.awt.Font("Futura", 1, 16)); // NOI18N
        doingTitle.setForeground(new java.awt.Color(255, 255, 255));
        doingTitle.setText("Doing");

        jScrollPane3.setBackground(new java.awt.Color(30, 30, 30));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(280, 5));

        doingContainer.setBackground(new java.awt.Color(54, 53, 59));
        doingContainer.setMaximumSize(new java.awt.Dimension(350, 0));
        doingContainer.setMinimumSize(new java.awt.Dimension(350, 0));
        doingContainer.setLayout(new javax.swing.BoxLayout(doingContainer, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(doingContainer);

        doneTitle.setFont(new java.awt.Font("Futura", 1, 16)); // NOI18N
        doneTitle.setForeground(new java.awt.Color(255, 255, 255));
        doneTitle.setText("Done");

        progressContainer.setBackground(new java.awt.Color(54, 53, 59));
        progressContainer.setMaximumSize(new java.awt.Dimension(180, 32767));
        progressContainer.setMinimumSize(new java.awt.Dimension(180, 0));
        progressContainer.setPreferredSize(new java.awt.Dimension(180, 58));

        progressLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        progressLabel.setForeground(new java.awt.Color(204, 203, 211));
        progressLabel.setText("Project Progress");

        projectProgress.setBackground(new java.awt.Color(204, 203, 211));
        projectProgress.setForeground(new java.awt.Color(151, 145, 189));
        projectProgress.setBorder(null);
        projectProgress.setBorderPainted(false);

        progressPercentage.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        progressPercentage.setForeground(new java.awt.Color(255, 255, 255));
        progressPercentage.setText("0%");

        javax.swing.GroupLayout progressContainerLayout = new javax.swing.GroupLayout(progressContainer);
        progressContainer.setLayout(progressContainerLayout);
        progressContainerLayout.setHorizontalGroup(
            progressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progressContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(progressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(progressContainerLayout.createSequentialGroup()
                        .addGroup(progressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progressLabel)
                            .addComponent(progressPercentage))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        progressContainerLayout.setVerticalGroup(
            progressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressPercentage)
                .addGap(12, 12, 12))
        );

        infoButton.setBackground(new java.awt.Color(30, 30, 30));
        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taaasks/media/info.png"))); // NOI18N
        infoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(userName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(projectNameContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(dateCreatedContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(totalTasksContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(progressContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(toDoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(addTask))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(doingTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doneTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName)
                    .addComponent(infoButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalTasksContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(projectNameContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(dateCreatedContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(progressContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTask)
                    .addComponent(toDoTitle)
                    .addComponent(doingTitle)
                    .addComponent(doneTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskActionPerformed
        CreateTask taskPopup = new CreateTask(this, true);

        taskPopup.setLocationRelativeTo(this);
        taskPopup.errorMessageHide();
        taskPopup.setVisible(true);

        if (!(toDoContainer.getLayout() instanceof BoxLayout)) {
            toDoContainer.setLayout(new BoxLayout(toDoContainer, BoxLayout.Y_AXIS));
        }
        
        if (toDoContainer.getBackground().equals(new Color(54,53,59))) {
            toDoContainer.setBackground(new Color(30,30,30));
        }
        
        if (taskPopup.submit) {
            
            numberOfTasks++;
            currentTasks++;
            totalTasks.setText(String.valueOf(currentTasks));
            Task task = new Task();
            task.setId(numberOfTasks);
            task.setTitle(taskPopup.getTaskTitle());
            task.setDescription(taskPopup.getTaskDescription());
            task.setTag((String) taskPopup.getTaskTag().getSelectedItem());

            int index = (int) taskPopup.getTaskTag().getSelectedIndex();
            setBackground(task, index);
            
        
            Dimension verticalSpacing = new Dimension(0, 10);
            toDoContainer.add(Box.createRigidArea(verticalSpacing)); // Add spacing above the task
            toDoContainer.add(task);
            toDoTasks.add(task);
            updateToDoContainer();
        }
        
    }//GEN-LAST:event_addTaskActionPerformed

    private void setBackground(Task task, int index) {
        switch (index) {
            case 0:
                task.setTagBackground(150,103,224);
                break;
            case 1:
                task.setTagBackground(212,187,252);
                break;
            case 2:
                task.setTagBackground(235,217,252);
                break;
            case 3:
                task.setTagBackground(242,235,251);
                break;
            case 4:
                task.setTagBackground(251,250,255);
                break;
            default:
                task.setTagBackground(255,255,255);
                break;
        }
    }
    
    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        InfoBox infoPopup = new InfoBox(this, true);

        infoPopup.setLocationRelativeTo(this);
        infoPopup.setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed
    
    public static void removeTask(int taskId) {
        boolean found = false;
        Iterator<Task> iteratorToDo = toDoTasks.iterator();
        while (iteratorToDo.hasNext()) {
            Task task = iteratorToDo.next();
            if (task.getId() == taskId) {
                found = true;
                iteratorToDo.remove();
                currentTasks--;
                totalTasks.setText(String.valueOf(currentTasks));
            }
        }
        if (!found) {
            Iterator<Task> iteratorDoing = doingTasks.iterator();
            while (iteratorDoing.hasNext()) {
                Task task = iteratorDoing.next();
                if (task.getId() == taskId) {
                    found = true;
                    iteratorDoing.remove();
                    currentTasks--;
                    totalTasks.setText(String.valueOf(currentTasks));
                }
            }
        }
        if (!found) {
            Iterator<Task> iteratorDone = doneTasks.iterator();
            while (iteratorDone.hasNext()) {
                Task task = iteratorDone.next();
                if (task.getId() == taskId) {
                    found = true;
                    iteratorDone.remove();
                    currentTasks--;
                    totalTasks.setText(String.valueOf(currentTasks));
                }
            }
        }
        updateToDoContainer();
        updateDoingContainer();
        updateDoneContainer();
    }
    
    public static void transferTask(int taskId, int containerIndex, Task task) {
        switch (containerIndex) {
            case 1:
                if (!(toDoContainer.getLayout() instanceof BoxLayout)) {
                    toDoContainer.setLayout(new BoxLayout(toDoContainer, BoxLayout.Y_AXIS));
                }

                if (toDoContainer.getBackground().equals(new Color(54,53,59))) {
                    toDoContainer.setBackground(new Color(30,30,30));
                }
                    Dimension verticalSpacing1 = new Dimension(0, 10);
                    toDoContainer.add(Box.createRigidArea(verticalSpacing1)); // Add spacing above the task
                    toDoContainer.add(task);
                    toDoTasks.add(task);
                break;
            case 2:
                if (!(doingContainer.getLayout() instanceof BoxLayout)) {
                    doingContainer.setLayout(new BoxLayout(doingContainer, BoxLayout.Y_AXIS));
                }

                if (doingContainer.getBackground().equals(new Color(54,53,59))) {
                    doingContainer.setBackground(new Color(30,30,30));
                }
                    Dimension verticalSpacing2 = new Dimension(0, 10);
                    doingContainer.add(Box.createRigidArea(verticalSpacing2)); // Add spacing above the task
                    doingContainer.add(task);
                    doingTasks.add(task);
                break;
            case 3:
                if (!(doneContainer.getLayout() instanceof BoxLayout)) {
                    doneContainer.setLayout(new BoxLayout(doneContainer, BoxLayout.Y_AXIS));
                }

                if (doneContainer.getBackground().equals(new Color(54,53,59))) {
                    doneContainer.setBackground(new Color(30,30,30));
                }
                    Dimension verticalSpacing3 = new Dimension(0, 10);
                    doneContainer.add(Box.createRigidArea(verticalSpacing3)); // Add spacing above the task
                    doneContainer.add(task);
                    doneTasks.add(task);
                break;
            default:
                break;
        }
        
    }
    
    public static void transferProcedure(int taskId, int transferIndex) {
        boolean found = false;
        Iterator<Task> iteratorToDo = toDoTasks.iterator();
        while (iteratorToDo.hasNext()) {
            Task task = iteratorToDo.next();
            if (task.getId() == taskId) {
                found = true;
                iteratorToDo.remove();
                transferTask(taskId, transferIndex, task);
            }
        }
        if (!found) {
            Iterator<Task> iteratorDoing = doingTasks.iterator();
            while (iteratorDoing.hasNext()) {
                Task task = iteratorDoing.next();
                if (task.getId() == taskId) {
                    found = true;
                    iteratorDoing.remove();
                    transferTask(taskId, transferIndex, task);
                }
            }
        }
        if (!found) {
            Iterator<Task> iteratorDone = doneTasks.iterator();
            while (iteratorDone.hasNext()) {
                Task task = iteratorDone.next();
                if (task.getId() == taskId) {
                    found = true;
                    iteratorDone.remove();
                    transferTask(taskId, transferIndex, task);
                }
            }
        }
        updateToDoContainer();
        updateDoingContainer();
        updateDoneContainer();
    }
        
    public static void updateToDoContainer() {
        Dimension verticalSpacing = new Dimension(0, 10);
        
        toDoContainer.removeAll();
        for (Task task : toDoTasks) {
            toDoContainer.add(task);
            toDoContainer.add(Box.createRigidArea(verticalSpacing)); // Add spacing above the task
        }
        toDoContainer.revalidate();
        toDoContainer.repaint();
        updateProgressBar();
    }
    
    public static void updateDoingContainer() {
        Dimension verticalSpacing = new Dimension(0, 10);
        
        doingContainer.removeAll();
        for (Task task : doingTasks) {
            doingContainer.add(task);
            doingContainer.add(Box.createRigidArea(verticalSpacing)); // Add spacing above the task
        }
        doingContainer.revalidate();
        doingContainer.repaint();
        updateProgressBar();
    }
    
    public static void updateDoneContainer() {
        Dimension verticalSpacing = new Dimension(0, 10);
        
        doneContainer.removeAll();
        for (Task task : doneTasks) {
            doneContainer.add(task);
            doneContainer.add(Box.createRigidArea(verticalSpacing)); // Add spacing above the task
        }
        doneContainer.revalidate();
        doneContainer.repaint();
        updateProgressBar();
    }
    
    public static void updateProgressBar() {
        float finished = doneTasks.size();
        float total = (float) currentTasks;
        float percentage = (float) (finished / total)  * 100;
        int intPercentage = (int) percentage;
        projectProgress.setValue(intPercentage);
        progressPercentage.setText(String.valueOf(intPercentage) + "%");
        
    }
    
    public void setWelcomeMessage(String text) {
        int currentHour = LocalDateTime.now().getHour();
        if (currentHour < 12) {
            userName.setText("Good Morning, " + text);
        } else {
            userName.setText("Good Afternoon, " + text);
        }
        
    }
    
    public void setProjectName(String text) {
        projectName.setText(text);
    }
    
    public void setProjectDate() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu", Locale.ENGLISH);
        String formattedDateTime = currentDateTime.format(formatter);
        projectDate.setText(formattedDateTime);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTask;
    private javax.swing.JPanel dateCreatedContainer;
    private static javax.swing.JPanel doingContainer;
    private javax.swing.JLabel doingTitle;
    private static javax.swing.JPanel doneContainer;
    private javax.swing.JLabel doneTitle;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JButton infoButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel progressContainer;
    private javax.swing.JLabel progressLabel;
    private static javax.swing.JLabel progressPercentage;
    private javax.swing.JLabel projectDate;
    private javax.swing.JLabel projectDateLabel;
    private javax.swing.JLabel projectName;
    private javax.swing.JPanel projectNameContainer;
    private javax.swing.JLabel projectNameLabel;
    private static javax.swing.JProgressBar projectProgress;
    private static javax.swing.JPanel toDoContainer;
    private javax.swing.JLabel toDoTitle;
    private static javax.swing.JLabel totalTasks;
    private javax.swing.JPanel totalTasksContainer;
    private javax.swing.JLabel totalTasksLabel;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
