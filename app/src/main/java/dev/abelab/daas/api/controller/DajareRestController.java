package dev.abelab.daas.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import dev.abelab.daas.api.request.DajareRankingRequest;
import dev.abelab.daas.api.response.DajareResponse;
import dev.abelab.daas.api.response.DajareRankingResponse;
import dev.abelab.daas.db.entity.Dajare;
import dev.abelab.daas.repository.DajareRepository;

@Api(tags = "Dajare")
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/dajare", produces = MediaType.APPLICATION_JSON_VALUE)
public class DajareRestController {

    private final DajareRepository dajareRepository;;

    /**
     * ダジャレ一覧取得API
     *
     * @return ダジャレ一覧レスポンス
     */
    @ApiOperation( //
            value = "ダジャレ一覧の取得", //
            notes = "ダジャレ一覧を取得する" //
    )
    @ApiResponses( //
            value = { //
                    @ApiResponse(code = 200, message = "取得成功", response = DajareResponse.class) //
            } //
    )
    @RequestMapping(path = "/list", method = RequestMethod.POST)
    public DajareResponse getDajare() {
        return null;
    }

    /**
     * ダジャレランキング取得API
     *
     * @param term 期間
     *
     * @return ダジャレランキングレスポンス
     */
    @ApiOperation( //
            value = "ダジャレランキングの取得", //
            notes = "週間，月間のランキングを取得する" //
    )
    @ApiResponses( //
            value = { //
                    @ApiResponse(code = 200, message = "取得成功", response = DajareRankingResponse.class) //
            } //
    )
    @RequestMapping(path = "/ranking", method = RequestMethod.POST)
    public DajareRankingResponse getDajareRanking(String term) {
        return null;
    }
}
