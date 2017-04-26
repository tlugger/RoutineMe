package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Enter your email address to sign in or create an account on RoutineMe");
        return "login";
    }

    @RequestMapping(value = "/routine", method = RequestMethod.GET)
    public String goToRoutine(Model model, @RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("description") String description, @RequestParam("date") String date){
        model.addAttribute("title", title);
        model.addAttribute("author", author);
        model.addAttribute("date", date);
        model.addAttribute("description", description);
        return "routine";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean login) {
        if (login != null && login.getEmail() != null & login.getPassword() != null) {
            if (login.getEmail().equals("chandra") && login.getPassword().equals("chandra123")) {
                model.addAttribute("msg", "welcome" + login.getEmail());
                ArrayList<Routine> list = new ArrayList<Routine>();

                Routine routine = new Routine();
                RoutineHeader header = new RoutineHeader();
                RoutineData data = new RoutineData();
                ExerciseCollection exercises = new ExerciseCollection();
                ReviewCollection reviews = new ReviewCollection();


                header.setTitle("On The Go");
                header.setAuthor("Jose Canizares");
                header.setDate("April 24, 2017");
                header.setDescription("A realistic weightlifting exercise for most ages. Give it a go!");
                routine.setRoutineHeader(header);

                data.setDuration("10 minutes");
                data.setDifficulty("5");
                data.setRating(2);

                routine.setData(data);

                Exercise warmup = new Exercise();
                Exercise workout = new Exercise();
                Exercise cooldown = new Exercise();

                warmup.setTitle("A short jog.");
                warmup.setExerciseType("Cardio");

                Step warmupStep1 = new Step();
                Step warmupStep2 = new Step();
                StepCollection warmupSteps = new StepCollection();

                warmupStep1.setStepText("Get outside");
                warmupStep2.setStepText("Jog!");
                warmupSteps.addStep(warmupStep1);
                warmupSteps.addStep(warmupStep2);

                warmupSteps.addStep(warmupStep1);
                warmupSteps.addStep(warmupStep2);

                warmup.setStepCollection(warmupSteps);

                workout.setTitle("Single-Leg Romanian Dead-Lift");
                workout.setExerciseType("strength");

                Step workoutStep1 = new Step();
                Step workoutStep2 = new Step();
                Step workoutStep3 = new Step();
                StepCollection workoutSteps = new StepCollection();

                workoutStep1.setStepText("Get two dumbbells of appropriate weight");
                workoutStep2.setStepText("Hold them in your hands and slowly lower as you raise your leg up and lean down with the weights.");
                workoutStep3.setStepText("Pull yourself back up and repeat for 3 sets of 6 reps per leg.");
                workoutSteps.addStep(workoutStep1);
                workoutSteps.addStep(workoutStep2);
                workoutSteps.addStep(workoutStep3);

                workout.setStepCollection(workoutSteps);

                cooldown.setTitle("Another short jog.");
                cooldown.setExerciseType("Cardio");

                Step cooldownStep1 = new Step();
                Step cooldownStep2 = new Step();
                StepCollection cooldownSteps = new StepCollection();

                cooldownStep1.setStepText("Get outside");
                cooldownStep2.setStepText("Jog again!");
                cooldownSteps.addStep(cooldownStep1);
                cooldownSteps.addStep(cooldownStep2);

                cooldownSteps.addStep(cooldownStep1);
                cooldownSteps.addStep(cooldownStep2);

                cooldown.setStepCollection(cooldownSteps);

                exercises.addExercise(warmup);
                exercises.addExercise(workout);
                exercises.addExercise(cooldown);

                routine.setExerciseCollection(exercises);

                Review review_1 = new Review();
                Review review_2 = new Review();
                Review review_3 = new Review();
                Review review_4 = new Review();

                review_1.setReviewText("Tried it, and it's a pretty okay workout. Only mildly impressed.");
                review_2.setReviewText("It's not a terrible routine.");
                review_3.setReviewText("Lovely!");
                review_4.setReviewText("I felt so tired after that workout.");

                review_1.setAuthor("Joseph");
                review_2.setAuthor("Jessica");
                review_3.setAuthor("Sam");
                review_4.setAuthor("Aaron");

                review_1.setDate("4/19/17");
                review_2.setDate("4/24/17");
                review_3.setDate("4/21/17");
                review_4.setDate("4/24/17");

                reviews.addReview(review_1);
                reviews.addReview(review_2);
                reviews.addReview(review_3);
                reviews.addReview(review_4);

                routine.setReviewCollection(reviews);

                //list.add(routine);

                Routine routine2 = new Routine();
                RoutineHeader header2 = new RoutineHeader();
                RoutineData data2 = new RoutineData();
                ExerciseCollection exercises2 = new ExerciseCollection();
                ReviewCollection reviews2 = new ReviewCollection();


                header2.setTitle("Weights");
                header2.setAuthor("Adam Heaton");
                header2.setDate("April 25, 2017");
                header2.setDescription("A realistic weightlifting exercise for most ages. Give it a go!");
                routine2.setRoutineHeader(header2);

                data2.setDuration("10 minutes");
                data2.setDifficulty("5");
                data2.setRating(2);

                routine2.setData(data2);

                Exercise warmup2 = new Exercise();
                Exercise workout2 = new Exercise();
                Exercise cooldown2 = new Exercise();

                warmup2.setTitle("A short jog.");
                warmup2.setExerciseType("Cardio");

                Step warmupStep21 = new Step();
                Step warmupStep22 = new Step();
                StepCollection warmupSteps2 = new StepCollection();

                warmupStep21.setStepText("Get outside");
                warmupStep22.setStepText("Jog!");
                warmupSteps2.addStep(warmupStep1);
                warmupSteps2.addStep(warmupStep2);

                warmupSteps2.addStep(warmupStep1);
                warmupSteps2.addStep(warmupStep2);

                warmup2.setStepCollection(warmupSteps);

                workout2.setTitle("Single-Leg Romanian Dead-Lift");
                workout2.setExerciseType("strength");

                Step workoutStep21 = new Step();
                Step workoutStep22 = new Step();
                Step workoutStep23 = new Step();
                StepCollection workoutSteps2 = new StepCollection();

                workoutStep21.setStepText("Get two dumbbells of appropriate weight");
                workoutStep22.setStepText("Hold them in your hands and slowly lower as you raise your leg up and lean down with the weights.");
                workoutStep23.setStepText("Pull yourself back up and repeat for 3 sets of 6 reps per leg.");
                workoutSteps2.addStep(workoutStep1);
                workoutSteps2.addStep(workoutStep2);
                workoutSteps2.addStep(workoutStep3);

                workout2.setStepCollection(workoutSteps);

                cooldown2.setTitle("Another short jog.");
                cooldown2.setExerciseType("Cardio");

                Step cooldownStep21 = new Step();
                Step cooldownStep22 = new Step();
                StepCollection cooldownSteps2 = new StepCollection();

                cooldownStep21.setStepText("Get outside");
                cooldownStep22.setStepText("Jog again!");
                cooldownSteps2.addStep(cooldownStep1);
                cooldownSteps2.addStep(cooldownStep2);

                cooldownSteps2.addStep(cooldownStep1);
                cooldownSteps2.addStep(cooldownStep2);

                cooldown2.setStepCollection(cooldownSteps);

                exercises2.addExercise(warmup);
                exercises2.addExercise(workout);
                exercises2.addExercise(cooldown);

                routine2.setExerciseCollection(exercises);

                RoutineCollection routineList = new RoutineCollection();
                routineList.addRoutine(routine);
                routineList.addRoutine(routine2);
                //routineList.addRoutine(routine3);
                //routineList.addRoutine(routine4);
                routineList.sortByAuthor();
                //list.add(routine2);
                //System.out.println("hi "+routineList.collection);

                model.addAttribute("routines",routineList.getSortedCollection());


                //model.addAttribute("routines",list);
                return "routineFeed";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}