import javax.swing.*;
import java.awt.*;

public class PortfolioDisplay {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Reet Kumar Bind");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 800);
            frame.setLayout(new GridLayout(0, 1));

            // Full Name
            JLabel nameLabel = new JLabel("Name: Reet Kumar Bind");
            nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
            nameLabel.setForeground(Color.BLUE);
            frame.add(nameLabel);

            // Contact Details
            JLabel contactLabel = new JLabel("Contact Details:");
            contactLabel.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(contactLabel);

            JTextArea contactDetails = new JTextArea(
                    "Email Address: [reetkumarbind@gmail.com]\n" +
                            "Telephone Number: [+919738443482]\n" +
                            "LinkedIn Profile: [Reetkumarbind]\n" +
                            "GitHub Profile: [Reetkumarbind]\n" +
                            "Personal Website: [Reetkumarbind.vercel.app]"
            );
            contactDetails.setEditable(false);
            frame.add(contactDetails);

            // Professional Summary
            JLabel summaryLabel = new JLabel("Professional Summary");
            summaryLabel.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(summaryLabel);

            JTextArea summaryDetails = new JTextArea(
                    "Reet Kumar Bind is a highly motivated and adept Software Engineer with [3+] years of experience in the design, development, and implementation of Java-based applications. " +
                            "He possesses a demonstrated capacity to perform effectively both independently and within collaborative, dynamic environments. " +
                            "Reet is deeply committed to crafting efficient, scalable, and user-centric software solutions."
            );
            summaryDetails.setEditable(false);
            frame.add(summaryDetails);

            // Technical Competencies
            JLabel techLabel = new JLabel("Technical Competencies");
            techLabel.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(techLabel);

            JTextArea techDetails = new JTextArea(
                    "Programming Languages: Java \n" +
                            "Frameworks and Libraries: Spring, Spring Boot, Hibernate, JUnit, Mockito\n" +
                            "Database Systems: MySQL, PostgreSQL, MongoDB, [Additional databases]\n" +
                            "Development Tools: Git, Maven, Gradle, Docker, Jenkins\n" +
                            "Operating Systems: Windows, Linux, macOS\n" +
                            "Cloud Platforms: Amazon Web Services (AWS), Microsoft Azure, Google Cloud Platform (GCP), [If applicable]\n" +
                            "Supplementary Skills: Agile methodologies, RESTful API development, Microservices architecture, Data Structures and Algorithms"
            );
            techDetails.setEditable(false);
            frame.add(techDetails);

            // Professional Projects
            JLabel projectsLabel = new JLabel("Professional Projects");
            projectsLabel.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(projectsLabel);

            JTextArea projectsDetails = new JTextArea(
                    "Project Title: Library Management System\n" +
                            "Overview: A web-based application designed to facilitate the administration of library resources, encompassing books, members, and transactions.\n" +
                            "Technologies Employed: Java, Spring Boot, MySQL, Thymeleaf\n" +
                            "Principal Features: User authentication and authorization mechanisms, Book catalogue management, Member administration, Book lending and return functionalities, Search and reporting capabilities.\n" +
                            "Responsibilities: Developed the backend API utilizing Spring Boot, Designed and implemented the database schema, Executed user authentication and authorization protocols."
            );
            projectsDetails.setEditable(false);
            frame.add(projectsDetails);

            // Professional Experience
            JLabel experienceLabel = new JLabel("Professional Experience");
            experienceLabel.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(experienceLabel);

            JTextArea experienceDetails = new JTextArea(
                    "Position Title: Software Engineer\n" +
                            "Employer: Appolo Computers Pvt. Ltd.\n" +
                            "Duration of Employment: June 2023 – Present\n" +
                            "Duties and Achievements: Developed and maintained Java-based microservices for a high-traffic e-commerce platform, Contributed to the design and implementation of RESTful APIs."
            );
            experienceDetails.setEditable(false);
            frame.add(experienceDetails);

            // Academic Qualifications
            JLabel academicLabel = new JLabel("Academic Qualifications");
            academicLabel.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(academicLabel);

            JTextArea academicDetails = new JTextArea(
                    "Degree: Bachelor of Computer Application\n" +
                            "Institution: [IICS, UPRTOU]\n" +
                            "Graduation Date: [May 2009]\n" +
                            "Relevant Coursework: Data Structures and Algorithms, Database Management Systems, Software Engineering"
            );
            academicDetails.setEditable(false);
            frame.add(academicDetails);

            // Finalize frame
            frame.setVisible(true);
        });
    }
}
