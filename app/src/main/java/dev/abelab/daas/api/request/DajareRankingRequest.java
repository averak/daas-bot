package dev.abelab.daas.api.request;

import lombok.*;

/**
 * ダジャレランキング取得リクエスト
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DajareRankingRequest {

    /**
     * 期間
     */
    @Builder.Default
    String term = "weekly";
}
