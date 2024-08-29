package com.hanwhaswcamp.section02.subsection02.qualifier;

import com.hanwhaswcamp.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {
    // Qualifer : 여러개의 빈 객체 중 특정 빈 객체를 이름으로 저장하는 어노테이션
    // (@Primary와 같이 쓰인 경우  @Qualifier가 우선 시 된다.)

    /* 1. 필드 주입의 경우 */
//    @Autowired
//    @Qualifier("pikachu")
    private Pokemon pokemon;

    /* 2. 생성자 주입의 경우*/
    @Autowired
    public PokemonService(@Qualifier("pikachu")Pokemon pokemon) {
        this.pokemon = pokemon;
    }

//    @Autowired
//    public PokemonService(Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
