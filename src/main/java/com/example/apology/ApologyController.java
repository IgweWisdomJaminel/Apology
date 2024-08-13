package com.example.apology;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@RestController
public class ApologyController {

    @GetMapping("/api/v1/apology")
    public Map<String, String> getApology() {
        Map<String, String> response = new HashMap<>();
        response.put("content", readFileFromResources("article.txt"));
        return response;
    }

    @GetMapping("/api/v1/apologys")
    public Map<String, String> getStructuredApology() {
        Map<String, String> response = new HashMap<>();
        response.put("title", "The Dangers of Posting Irrelevant Content: My Lesson Learned");
        response.put("content", "Hello everyone, I hope this message finds you well. Today, I want to address an important issue that affects our community and share a personal experience that has taught me a valuable lesson in which I sadly was an offender. Recently, I made the mistake of posting irrelevant content in this channel. This action was not only inappropriate and dangerous but also disruptive to the flow of meaningful conversations within our channel. I understand that our community thrives on relevant, engaging, and purposeful discussions, and my actions did not align with these values which resulted in me being put in the trenches by Lrd bishop the seventh:pensive:. Now I will love to share you all my knowledge on; The Dangers of Irrelevant Posts Posting irrelevant content can have several negative impacts: -Distraction: It diverts attention from important topics and discussions, making it harder for members to stay focused on what matters. -Clutter: It adds unnecessary noise to the channels, making it difficult for members to find valuable information. -Frustration: It can lead to frustration among members who are looking for specific information or engaging in meaningful conversations. -Reputation: It can harm the reputation of the poster and reduce their credibility within the community. My Offence and Apology I acknowledge that my actions were not in line with the community guidelines, and for that, I sincerely apologize. I understand the importance of maintaining the quality of our discussions and the trust that we place in each other to contribute positively. I want to take this opportunity to apologize to everyone for any inconvenience or frustration my post may have caused. I am committed to learning from this experience and ensuring that my future contributions are relevant, valuable and not dangerous. A Call for Reactions(my people help me oh!!) As part of my commitment to making amends, I kindly ask for your support in reacting to this post. Your reactions will not only help me understand the impact of my actions but also reinforce the importance of maintaining the quality of our community interactions. Please I need 30 reactions:pray::sob: in other for my apology and this airticle to be valid Acknowledgements I would like to thank Haedes for providing this option for me to apologize and also learn from my mistakes Your guidance and support are invaluable, and I am grateful for the opportunity to learn and grow within this community. Thank you for your understanding and support.:pleading_face:");
        return response;
    }

    private String readFileFromResources(String filename) {
        try (InputStream inputStream = new ClassPathResource(filename).getInputStream();
             Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            return scanner.useDelimiter("\\A").next();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error reading the article.";
        }
    }
}