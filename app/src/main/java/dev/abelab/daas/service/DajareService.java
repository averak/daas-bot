package dev.abelab.daas.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import dev.abelab.daas.db.entity.Dajare;
import dev.abelab.daas.repository.DajareRepository;

@RequiredArgsConstructor
@Service
public class DajareService {

    private final DajareRepository dajareRepository;

    /**
     * ダジャレを採点
     *
     * @param dajare ダジャレ
     *
     * @return ダジャレ
     */
    public Dajare gradeDajare(Dajare dajare) {
        // 1. 判定
        dajare = this.judgeDajare(dajare);
        // 2. 評価
        dajare = this.evalDajare(dajare);
        // 3. 読み変換
        dajare = this.readingDajare(dajare);

        return dajare;
    }

    /**
     * 前処理
     *
     * @param dajare ダジャレ
     *
     * @return ダジャレ
     */
    public Dajare preprocessing(Dajare dajare) {
        return dajare;
    }

    /**
     * ダジャレを判定
     *
     * @param dajare ダジャレ
     *
     * @return ダジャレ
     */
    private Dajare judgeDajare(Dajare dajare) {
        dajare.setIsDajare(true);
        return dajare;
    }

    /**
     * ダジャレを評価
     *
     * @param dajare ダジャレ
     *
     * @return ダジャレ
     */
    private Dajare evalDajare(Dajare dajare) {
        dajare.setScore(3.0);
        return dajare;
    }

    /**
     * ダジャレを読みに変換
     *
     * @param dajare ダジャレ
     *
     * @return ダジャレ
     */
    private Dajare readingDajare(Dajare dajare) {
        dajare.setReading("フトンガフットンダ");
        return dajare;
    }
}
