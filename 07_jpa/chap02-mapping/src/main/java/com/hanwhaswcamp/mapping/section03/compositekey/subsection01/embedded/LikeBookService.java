package com.hanwhaswcamp.mapping.section03.compositekey.subsection01.embedded;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LikeService {

    private LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Transactional
    public void generateLikeBook(LikeDTO likeDTO){
        Like like = new Like(
                new LikeCompositeKey(
                        likeDTO.getLikedMemberNo(),
                        likeDTO.getLikeBookNo()
                )
        );

        likeRepository.save(like);
    }
}
