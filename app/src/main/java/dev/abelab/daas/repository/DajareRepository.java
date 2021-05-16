package dev.abelab.daas.repository;

import java.util.Optional;

import lombok.RequiredArgsConstructor;
import dev.abelab.daas.db.entity.Dajare;
import dev.abelab.daas.db.mapper.DajareMapper;

@RequiredArgsConstructor
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
    public Optional<Dajare> findById(int id) {
        return Optional.ofNullable(this.dajareMapper.selectByPrimaryKey(id));
    }
}
