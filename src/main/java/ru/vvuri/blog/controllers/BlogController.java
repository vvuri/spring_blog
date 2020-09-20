package ru.vvuri.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vvuri.blog.models.Post;
import ru.vvuri.blog.repo.PostRepository;

@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository; // связываем с репозиторием, который связан с моделью - таблицеы БД

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll(); // вытаскиваем данные из БД
        model.addAttribute("posts", posts); // передаем данные в шаблон

        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        model.addAttribute("title", "Add new post");
        return "block-add";
    }

    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title,
                              @RequestParam String anons,
                              @RequestParam String full_text,
                              Model model) {
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/blog";
    }

}
