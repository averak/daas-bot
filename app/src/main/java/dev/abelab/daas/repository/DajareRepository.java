package dev.abelab.daas.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;

import dev.abelab.daas.db.entity.Dajare;
import dev.abelab.daas.db.mapper.DajareMapper;

@RequiredArgsConstructor
@Repository
public class DajareRepository {

    private final DajareMapper dajareMapper;

    /**
     * ダジャレを作成
     *
     * @param dajare ダジャレ
     *
     * @return ダジャレID
     */
    public int insert(Dajare dajare) {
        return this.dajareMapper.insertSelective(dajare);
    }

    /**
     * IDからダジャレを検索
     *
     * @param id ダジャレID
     *
     * @return ダジャレ
     */
    public Optional<Dajare> selectById(int id) {
        return Optional.ofNullable(this.dajareMapper.selectByPrimaryKey(id));
    }
}
