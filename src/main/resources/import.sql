INSERT INTO `aircraft` (`date_immatriculation`, `hdv`, `immatriculation`, `model`, `type`) VALUES ('2023-01-15', '100', 'ABC123', 'Boeing 737', 'Passenger');
INSERT INTO `aircraft` (`date_immatriculation`, `hdv`, `immatriculation`, `model`, `type`) VALUES ('2022-12-20', '150', 'XYZ789', 'Airbus A320', 'Cargo');
INSERT INTO `aircraft` (`date_immatriculation`, `hdv`, `immatriculation`, `model`, `type`) VALUES ('2023-03-10', '80', 'DEF456', 'Cessna 172', 'Training');

INSERT INTO `role` (`name`) VALUES ('ADMIN');
INSERT INTO `role` (`name`) VALUES ('INSTRUCTOR');
INSERT INTO `role` (`name`) VALUES ('STUDENT');
INSERT INTO `role` (`name`) VALUES ('PILOT');

INSERT INTO `person` (`name`, `password`, `surname`, `username`, `person_type`, `hdv`, `licence` ) VALUES ('John', '$2a$10$qaimlDx3J5UbEBmdV/F6MeLvD2VvjnV0qrYJm016j.HZdRxEXk312', 'Doe', 'johndoe', 'Pilot', '200', 'Commercial');
INSERT INTO `person` (`name`, `password`, `surname`, `username`, `person_type`, `hdv`, `licence`) VALUES ('Alice', 'pass456', 'Smith', 'alicesmith', 'Pilot', '300', 'Private');
INSERT INTO `person` (`name`, `password`, `surname`, `username`, `person_type`, `hdv`, `licence`) VALUES ('Bob', 'pass789', 'Johnson', 'bobjohnson', 'Pilot', '150', 'Commercial');
INSERT INTO `person` (`name`, `password`, `surname`, `username`, `person_type`, `hdv`, `licence`) VALUES ('Jerome', 'pass123', 'client', 'jeromec', 'StudentPilot', '150', 'Commercial');
INSERT INTO `person` (`name`, `password`, `surname`, `username`, `person_type`, `hdv`, `licence`) VALUES ('Cedric', 'pass456', 'Yaourt', 'cedric', 'StudentPilot', '170', 'Private');
INSERT INTO `person` (`name`, `password`, `surname`, `username`, `person_type`, `hdv`, `licence`) VALUES ('Xavier', 'pass789', 'Badinter', 'xavierbad', 'StudentPilot', '200', 'Commercial');

INSERT INTO `pilot` (`id`) VALUES (1);
INSERT INTO `pilot` (`id`) VALUES (2);
INSERT INTO `pilot` (`id`) VALUES (3);

INSERT INTO `person_roles` (`person_id`, `roles_id`) VALUES (1, 1);
INSERT INTO `person_roles` (`person_id`, `roles_id`) VALUES (2, 2);
INSERT INTO `person_roles` (`person_id`, `roles_id`) VALUES (3, 3);

INSERT INTO `instructor` (`id`) VALUES (1);
INSERT INTO `instructor` (`id`) VALUES (2);
INSERT INTO `instructor` (`id`) VALUES (3);

INSERT INTO `day_available_instructor` (`instructor_id`, `day_available`) VALUES (1, 'MONDAY');
INSERT INTO `day_available_instructor` (`instructor_id`, `day_available`) VALUES (1, 'WEDNESDAY');
INSERT INTO `day_available_instructor` (`instructor_id`, `day_available`) VALUES (2, 'TUESDAY');

INSERT INTO `promotion` (`instructor_id`, `name`) VALUES (1, 'Spring 2023');
INSERT INTO `promotion` (`instructor_id`, `name`) VALUES (2, 'Summer 2023');
INSERT INTO `promotion` (`instructor_id`, `name`) VALUES (3, 'Fall 2023');

INSERT INTO `student_pilot` (`id`, `promotion_id`) VALUES (4, 1);
INSERT INTO `student_pilot` (`id`, `promotion_id`) VALUES (5, 2);
INSERT INTO `student_pilot` (`id`, `promotion_id`) VALUES (6, 1);

INSERT INTO `reservation` (`aircraft_id`, `date`, `part_of_the_day`) VALUES (1, '2023-05-10', 'MATIN');
INSERT INTO `reservation` (`aircraft_id`, `date`, `part_of_the_day`) VALUES (2, '2023-06-15', 'SOIR');
INSERT INTO `reservation` (`aircraft_id`, `date`, `part_of_the_day`) VALUES (3, '2023-07-20', 'MATIN');
INSERT INTO `reservation` (`aircraft_id`, `date`, `part_of_the_day`) VALUES (2, '2023-05-10', 'MATIN');
INSERT INTO `reservation` (`aircraft_id`, `date`, `part_of_the_day`) VALUES (3, '2023-06-15', 'SOIR');
INSERT INTO `reservation` (`aircraft_id`, `date`, `part_of_the_day`) VALUES (1, '2023-07-20', 'MATIN');

INSERT INTO `reservation_student` (`id`, `instructor_id`, `student_pilot_id`) VALUES (1, 1, 4);
INSERT INTO `reservation_student` (`id`, `instructor_id`, `student_pilot_id`) VALUES (2, 2, 5);
INSERT INTO `reservation_student` (`id`, `instructor_id`, `student_pilot_id`) VALUES (3, 3, 6);

INSERT INTO `reservation_pilot` (`id`, `pilot_id`) VALUES (4, 1);
INSERT INTO `reservation_pilot` (`id`, `pilot_id`) VALUES (5, 2);
INSERT INTO `reservation_pilot` (`id`, `pilot_id`) VALUES (6, 3);

INSERT INTO `reservation_date_instr` (`date`, `instructor_id`, `part_of_the_day`) VALUES ('2023-05-12', 1, 'MATIN');
INSERT INTO `reservation_date_instr` (`date`, `instructor_id`, `part_of_the_day`) VALUES ('2023-06-18', 2, 'SOIR');
INSERT INTO `reservation_date_instr` (`date`, `instructor_id`, `part_of_the_day`) VALUES ('2023-07-25', 3, 'MATIN');

INSERT INTO `maintenance` (`date_debut`, `date_fin`, `mechanic`) VALUES ('2023-02-05', '2023-02-07', 'BADINTER');
INSERT INTO `maintenance` (`date_debut`, `date_fin`, `mechanic`) VALUES ('2023-03-20', '2023-03-22', 'DOUILLET');
INSERT INTO `maintenance` (`date_debut`, `date_fin`, `mechanic`) VALUES ('2023-04-10', '2023-04-12', 'CLAY');

INSERT INTO `type_of_maintenance` (`type`) VALUES ('Scheduled');
INSERT INTO `type_of_maintenance` (`type`) VALUES ('Emergency');
INSERT INTO `type_of_maintenance` (`type`) VALUES ('Routine');

INSERT INTO `unavailability` (`aircraft_id`, `reason`, `date_debut`, `date_fin`) VALUES (1, 'MAINTENANCE', '2023-02-05', '2023-02-07');
INSERT INTO `unavailability` (`aircraft_id`, `reason`, `date_debut`, `date_fin`) VALUES (2, 'RESERVED', '2023-03-20', '2023-03-22');
INSERT INTO `unavailability` (`aircraft_id`, `reason`, `date_debut`, `date_fin`) VALUES (3, 'OTHER', '2023-04-10', '2023-04-12');
