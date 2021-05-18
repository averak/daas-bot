package dev.abelab.daas.api.response;

import java.util.List;

import lombok.Value;
import lombok.Builder;
import lombok.Singular;

import dev.abelab.daas.db.entity.Dajare;

/**
 * ダジャレ一覧レスポンス
 */
@Value
@Builder
public class DajareResponse {

    /**
     * ダジャレリスト
     */
    @Singular
    List<Dajare> dajares;
}
