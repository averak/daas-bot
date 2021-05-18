package dev.abelab.daas.api.response;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import dev.abelab.daas.db.entity.Dajare;

/**
 * ダジャレランキングレスポンス
 */
@Value
@Builder
public class DajareRankingResponse {

    /**
     * ダジャレリスト
     */
    @Singular
    List<Dajare> dajares;
}
