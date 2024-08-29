package com.hanwhaswcamp.section02.subsection05.inject;

import com.hanwhaswcamp.section02.common.Pokemon;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

import java.util.StringTokenizer;

@Service("pokemonServiceInject")
public class PokemonService {

    // @Inject : 자바 진영에서 제공하는 DI 어노테이션
    // @Autowired 스프리이 어노테이션과 유사하게 type을 통해 의존성 주입을 하며 @Named을 통해 빈 이름을 명시할 수 있다.
    // 필드, 생성자, 세터 주입 방식이 가능하다.

//    @Inject
//    @Named("pikachu")
    private Pokemon pokemon;

    @Inject
    public PokemonService(@Named("pikachu")Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
