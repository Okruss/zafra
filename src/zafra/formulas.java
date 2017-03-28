package zafra;

/**
 *
 * @author Obeth Cruz
 */
public class formulas {

    public double bagazoTon(Double CaMoBr, Double AgDeImbTon, Double JugMezTon) {
        //1
        Double bagTon = (CaMoBr + AgDeImbTon) - JugMezTon;
        return bagTon;
    }

    public double imbPorCan(Double AgDeImbTon, Double CaMoBr) {
        //2
        Double imbPorCana = (AgDeImbTon / CaMoBr) * 100;
        return imbPorCana;
    }

    public double extJugMezPorCan(Double JugMezTon, Double CaMoBr) {
        //3
        Double exJugMezPorCana = (JugMezTon / CaMoBr) * 100;
        return exJugMezPorCana;
    }

    public double bagazoPorCan(Double BagazoTon, Double CaMoBr) {
        //4
        Double bagazoPorCana = (BagazoTon / CaMoBr) * 100;
        return bagazoPorCana;
    }

    public double purJugResi(Double PolJugRes, Double BrixJugRes) {
        //5
        Double purezaJugResi = (PolJugRes / BrixJugRes) * 100;
        return purezaJugResi;
    }

    public double BrixEnBag(Double PolBag, Double PurezaJugRes) {
        //6
        Double BrixBagazo = (PolBag / PurezaJugRes) * 100;
        return BrixBagazo;
    }

    public double FibraPorBag(Double porHumBag, Double BrixBagazo) {
        //7
        Double FibraPorBagazo = 100 - porHumBag - BrixBagazo;
        return FibraPorBagazo;
    }

    public double FibraPorCan(Double BagazoPorCana, Double FibraPorBagazo) {
        //8
        Double FibraPorCana = (BagazoPorCana * FibraPorBagazo) / 100;
        return FibraPorCana;
    }

    public double tonFibraCan(Double CaMoBr, Double FibraPorCana) {
        //9
        Double tonFibCan = (CaMoBr * FibraPorCana) / 100;
        return tonFibCan;
    }

    public double tonSolJugMez(Double JugMezTon, Double BrixJugMez) {
        //10
        Double tonSolJugMezclado = (JugMezTon * BrixJugMez) / 100;
        return tonSolJugMezclado;
    }

    public double tonPolJugMez(Double JugMezTon, Double PolJugMez) {
        //11
        Double tonPolJuzMezclado = (JugMezTon * PolJugMez) / 100;
        return tonPolJuzMezclado;
    }

    public double tonSolBag(Double BagTon, Double BrixBag) {
        //12
        Double tonSolBagazo = (BagTon * BrixBag) / 100;
        return tonSolBagazo;
    }

    public double tonPolBag(Double BagTon, Double PolBag) {
        //13
        Double tonPolBagazo = (BagTon * PolBag) / 100;
        return tonPolBagazo;
    }

    public double tonSolCan(Double tonSolJugMez, Double tonSolBag) {
        //14
        Double tonSolCana = tonSolJugMez + tonSolBag;
        return tonSolCana;
    }

    public double tonPolCan(Double tonPolJugMez, Double tonPolBagazo) {
        //15
        Double tonPolCana = tonPolJugMez + tonPolBagazo;
        return tonPolCana;
    }

    public double polPorCan(Double tonPolCana, Double CanMolBr) {
        //16
        Double polPorCana = (tonPolCana / CanMolBr) * 100;
        return polPorCana;
    }

    public double tonJugAbs(Double CanMoBr, Double tonFibCana) {
        //17
        Double tonJugAbsoluto = CanMoBr - tonFibCana;
        return tonJugAbsoluto;
    }

    public double brixJugAbs(Double tonSolCana, Double tonJugAbs) {
        //18
        Double brixJugAbsoluto = (tonSolCana / tonJugAbs) * 100;
        return brixJugAbsoluto;
    }

    public double tonJugAbsExt(Double tonSolJugMez, Double BrixJugAbs) {
        //19
        Double tonJugAbsExtraido = (tonSolJugMez / BrixJugAbs) * 100;
        return tonJugAbsExtraido;
    }

    public double extJugAbsPorCan(Double tonJugAbsExt, Double CaMoBr) {
        //20
        Double extJugAbsPorCana = (tonJugAbsExt / CaMoBr) * 100;
        return extJugAbsPorCana;
    }

    public double polJugAbs(Double tonPolCana, Double tonJugAbs) {
        //21
        Double polJugAbsoluto = (tonPolCana / tonJugAbs) * 100;
        return polJugAbsoluto;
    }

    public double purJugAbs(Double polJugabs, Double BrixJugAbs) {
        //22
        Double purJugAbsoluto = (polJugabs / BrixJugAbs) * 100;
        return purJugAbsoluto;
    }

    public double tonAguaDiluc(Double JugMezTon, Double tonJugAbsExt) {
        //23
        Double tonAguaDilucion = JugMezTon - tonJugAbsExt;
        return tonAguaDilucion;
    }

    public double diluPorCan(Double tonAguaDil, Double CaMoBr) {
        //24
        Double diluPorCana = (tonAguaDil / CaMoBr) * 100;
        return diluPorCana;
    }

    public double extPolPorCan(Double tonPolJugMez, Double tonPolCan) {
        //25
        Double extPolPorCana = (tonPolJugMez / tonPolCan) * 100;
        return extPolPorCana;
    }

    public double tonAguaBaga(Double BagazoTon, Double porHumBaga) {
        //27
        Double tonAguaBagazo = (BagazoTon * porHumBaga) / 100;
        return tonAguaBagazo;
    }

    public double tonSolJugRes(Double CaMoBr, Double BrixJugRes) {
        //29
        Double tonSolJugResidual = (CaMoBr * BrixJugRes) / 100;
        return tonSolJugResidual;
    }

    public double tonPolJugRes(Double CaMoBr, Double PolJugRes) {
        //30
        Double tonPolJugRes = (CaMoBr * PolJugRes) / 100;
        return tonPolJugRes;
    }

    public double brixJugMezclado(Double tonSolJugMez, Double jugMezTon) {
        //31 Se toman valores a la fecha
        Double brixJugMez = (tonSolJugMez / jugMezTon) * 100;
        return brixJugMez;
    }

    public double brixJugoResidual(Double tonSolJugRes, Double CaMoBr) {
        //32 Se toman valores a la fecha
        Double brixJugoRes = (tonSolJugRes / CaMoBr) * 100;
        return brixJugoRes;
    }

    public double polJugMezclado(Double tonPolJugMez, Double jugMezTon) {
        //33 Se toman valores a la fecha
        Double polJugoMe = (tonPolJugMez / jugMezTon) * 100;
        return polJugoMe;
    }

    public double polJugRes(Double tonPolJugRes, Double CaMoBr) {
        //34 Se toman valores a la fecha
        Double polJugoRes = (tonPolJugRes / CaMoBr) * 100;
        return polJugoRes;
    }

    public double polBagazo(Double tonPolBag, Double BagTon) {
        //35 Se toman valores a la fecha
        //Marcado como dato de entrada.
        Double polBaga = (tonPolBag / BagTon)*100;
        return polBaga;
    }

    public double purJugMez(Double polJugMez, Double BrixJugMez) {
        //36
        Double purezaJugMez = (polJugMez / BrixJugMez)*100;
        return purezaJugMez;
    }

}
